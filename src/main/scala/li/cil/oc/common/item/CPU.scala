package li.cil.oc.common.item

import java.util
import li.cil.oc.Settings
import li.cil.oc.util.Tooltip
import net.minecraft.client.renderer.texture.IconRegister
import net.minecraft.entity.player.EntityPlayer
import net.minecraft.item.ItemStack

class CPU(val parent: Delegator, val tier: Int) extends Delegate {
  val baseName = "CPU"
  val unlocalizedName = baseName + tier

  override def tooltipLines(stack: ItemStack, player: EntityPlayer, tooltip: util.List[String], advanced: Boolean) {
    tooltip.addAll(Tooltip.get(baseName, Settings.get.cpuComponentSupport(tier)))
    super.tooltipLines(stack, player, tooltip, advanced)
  }

  override def registerIcons(iconRegister: IconRegister) {
    super.registerIcons(iconRegister)

    icon = iconRegister.registerIcon(Settings.resourceDomain + ":cpu" + tier)
  }
}
