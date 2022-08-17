package net.horizonsend.ion.core.events

import org.bukkit.entity.Player
import org.bukkit.event.Event
import org.bukkit.event.HandlerList

class CreateNationEvent(val player: Player, val nation: String) : Event(true) {
	override fun getHandlers(): HandlerList {
		return handlerList
	}

	companion object {
		@JvmStatic
		val handlerList = HandlerList()
	}
}