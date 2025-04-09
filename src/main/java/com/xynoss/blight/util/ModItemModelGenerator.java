package com.xynoss.blight.util;

import com.xynoss.blight.item.ModItems;
import net.minecraft.client.data.*;
import net.minecraft.client.render.item.model.ItemModel;
import net.minecraft.client.render.item.model.RangeDispatchItemModel;
import net.minecraft.client.render.item.property.numeric.UseDurationProperty;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;

import java.util.function.BiConsumer;

public class ModItemModelGenerator {
    public final ItemModelOutput output;
    public final BiConsumer<Identifier, ModelSupplier> modelCollector;


    public ModItemModelGenerator(ItemModelOutput output, BiConsumer<Identifier, ModelSupplier> modelCollector) {
        this.output = output;
        this.modelCollector = modelCollector;
    }

    public final Identifier ModUpload(Item item, Model model) {
        return model.upload(ModelIds.getItemModelId(item), TextureMap.layer0(item), this.modelCollector);
    }

    public final void ModRegister(Item item, Model model) {
        this.output.accept(item, ItemModels.basic(this.ModUpload(item, model)));
    }
    public final Identifier ModRegisterSubModel(Item item, String suffix, Model model) {
        return model.upload(ModelIds.getItemSubModelId(item, suffix), TextureMap.layer0(TextureMap.getSubId(item, suffix)), this.modelCollector);
    }

    public final void ModRegisterBow(Item item) {
        ItemModel.Unbaked unbaked = ItemModels.basic(this.ModUpload(item, Models.BOW));
        ItemModel.Unbaked unbaked2 = ItemModels.basic(this.ModRegisterSubModel(item, "_pulling_0", Models.BOW));
        ItemModel.Unbaked unbaked3 = ItemModels.basic(this.ModRegisterSubModel(item, "_pulling_1", Models.BOW));
        ItemModel.Unbaked unbaked4 = ItemModels.basic(this.ModRegisterSubModel(item, "_pulling_2", Models.BOW));
        this.output.accept(item, ItemModels.condition(ItemModels.usingItemProperty(), ItemModels.rangeDispatch(new UseDurationProperty(false), 0.05F, unbaked2, new RangeDispatchItemModel.Entry[]{ItemModels.rangeDispatchEntry(unbaked3, 0.65F), ItemModels.rangeDispatchEntry(unbaked4, 0.9F)}), unbaked));
    }
}
