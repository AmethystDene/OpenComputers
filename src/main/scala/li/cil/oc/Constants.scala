package li.cil.oc

import li.cil.oc.util.ItemUtils

object Constants {

  object BlockName {
    final val Adapter = "adapter"
    final val Assembler = "assembler"
    final val Cable = "cable"
    final val Capacitor = "capacitor"
    final val CarpetedCapacitor = "carpetedcapacitor"
    final val CaseCreative = "casecreative"
    final val CaseTier1 = "case1"
    final val CaseTier2 = "case2"
    final val CaseTier3 = "case3"
    final val ChameliumBlock = "chameliumblock"
    final val Charger = "charger"
    final val Disassembler = "disassembler"
    final val DiskDrive = "diskdrive"
    final val Endstone = "endstone"
    final val Geolyzer = "geolyzer"
    final val HologramTier1 = "hologram1"
    final val HologramTier2 = "hologram2"
    final val Keyboard = "keyboard"
    final val Microcontroller = "microcontroller"
    final val MotionSensor = "motionsensor"
    final val NetSplitter = "netsplitter"
    final val PowerConverter = "powerconverter"
    final val PowerDistributor = "powerdistributor"
    final val Print = "print"
    final val Printer = "printer"
    final val Raid = "raid"
    final val Redstone = "redstone"
    final val Relay = "relay"
    final val Robot = "robot"
    final val RobotAfterimage = "robotafterimage"
    final val ScreenTier1 = "screen1"
    final val ScreenTier2 = "screen2"
    final val ScreenTier3 = "screen3"
    final val Rack = "rack"
    final val Transposer = "transposer"
    final val Waypoint = "waypoint"

    def Case(tier: Int): String = ItemUtils.caseNameWithTierSuffix("case", tier)
  }

  object ItemName {
    final val AbstractBusCard = "abstractbuscard"
    final val Acid = "acid"
    final val Alu = "alu"
    final val Analyzer = "analyzer"
    final val AngelUpgrade = "angelupgrade"
    final val APUCreative = "apucreative"
    final val APUTier1 = "apu1"
    final val APUTier2 = "apu2"
    final val ArrowKeys = "arrowkeys"
    final val BatteryUpgradeTier1 = "batteryupgrade1"
    final val BatteryUpgradeTier2 = "batteryupgrade2"
    final val BatteryUpgradeTier3 = "batteryupgrade3"
    final val ButtonGroup = "buttongroup"
    final val Card = "card"
    final val CardContainerTier1 = "cardcontainer1"
    final val CardContainerTier2 = "cardcontainer2"
    final val CardContainerTier3 = "cardcontainer3"
    final val Chamelium = "chamelium"
    final val ChipTier1 = "chip1"
    final val ChipTier2 = "chip2"
    final val ChipTier3 = "chip3"
    final val ChunkloaderUpgrade = "chunkloaderupgrade"
    final val CircuitBoard = "circuitboard"
    final val ComponentBusTier1 = "componentbus1"
    final val ComponentBusTier2 = "componentbus2"
    final val ComponentBusTier3 = "componentbus3"
    final val ComponentBusCreative = "componentbuscreative"
    final val CPUTier1 = "cpu1"
    final val CPUTier2 = "cpu2"
    final val CPUTier3 = "cpu3"
    final val CraftingUpgrade = "craftingupgrade"
    final val ControlUnit = "cu"
    final val CuttingWire = "cuttingwire"
    final val DatabaseUpgradeTier1 = "databaseupgrade1"
    final val DatabaseUpgradeTier2 = "databaseupgrade2"
    final val DatabaseUpgradeTier3 = "databaseupgrade3"
    final val DataCardTier1 = "datacard1"
    final val DataCardTier2 = "datacard2"
    final val DataCardTier3 = "datacard3"
    final val DebugCard = "debugcard"
    final val Debugger = "debugger"
    final val DiamondChip = "chipdiamond"
    final val Disk = "disk"
    final val DiskDriveMountable = "diskdrivemountable"
    final val Drone = "drone"
    final val DroneCaseCreative = "dronecasecreative"
    final val DroneCaseTier1 = "dronecase1"
    final val DroneCaseTier2 = "dronecase2"
    final val EEPROM = "eeprom"
    final val ExperienceUpgrade = "experienceupgrade"
    final val Floppy = "floppy"
    final val GeneratorUpgrade = "generatorupgrade"
    final val GraphicsCardTier1 = "graphicscard1"
    final val GraphicsCardTier2 = "graphicscard2"
    final val GraphicsCardTier3 = "graphicscard3"
    final val HDDTier1 = "hdd1"
    final val HDDTier2 = "hdd2"
    final val HDDTier3 = "hdd3"
    final val HoverBoots = "hoverboots"
    final val HoverUpgradeTier1 = "hoverupgrade1"
    final val HoverUpgradeTier2 = "hoverupgrade2"
    final val InkCartridgeEmpty = "inkcartridgeempty"
    final val InkCartridge = "inkcartridge"
    final val InternetCard = "internetcard"
    final val Interweb = "interweb"
    final val InventoryControllerUpgrade = "inventorycontrollerupgrade"
    final val InventoryUpgrade = "inventoryupgrade"
    final val LeashUpgrade = "leashupgrade"
    final val LinkedCard = "linkedcard"
    final val LuaBios = "luabios"
    final val MFU = "mfu"
    final val Manual = "manual"
    final val MicrocontrollerCaseCreative = "microcontrollercasecreative"
    final val MicrocontrollerCaseTier1 = "microcontrollercase1"
    final val MicrocontrollerCaseTier2 = "microcontrollercase2"
    final val Nanomachines = "nanomachines"
    final val NavigationUpgrade = "navigationupgrade"
    final val NetworkCard = "lancard"
    final val NumPad = "numpad"
    final val OpenOS = "openos"
    final val PistonUpgrade = "pistonupgrade"
    final val Present = "present"
    final val PrintedCircuitBoard = "printedcircuitboard"
    final val RAMTier1 = "ram1"
    final val RAMTier2 = "ram2"
    final val RAMTier3 = "ram3"
    final val RAMTier4 = "ram4"
    final val RAMTier5 = "ram5"
    final val RAMTier6 = "ram6"
    final val RawCircuitBoard = "rawcircuitboard"
    final val RedstoneCardTier1 = "redstonecard1"
    final val RedstoneCardTier2 = "redstonecard2"
    final val ServerCreative = "servercreative"
    final val ServerTier1 = "server1"
    final val ServerTier2 = "server2"
    final val ServerTier3 = "server3"
    final val SignUpgrade = "signupgrade"
    final val SolarGeneratorUpgrade = "solargeneratorupgrade"
    final val Tablet = "tablet"
    final val TabletCaseCreative = "tabletcasecreative"
    final val TabletCaseTier1 = "tabletcase1"
    final val TabletCaseTier2 = "tabletcase2"
    final val TankControllerUpgrade = "tankcontrollerupgrade"
    final val TankUpgrade = "tankupgrade"
    final val Terminal = "terminal"
    final val TerminalServer = "terminalserver"
    final val TexturePicker = "texturepicker"
    final val TractorBeamUpgrade = "tractorbeamupgrade"
    final val TradingUpgrade = "tradingupgrade"
    final val Transistor = "transistor"
    final val UpgradeContainerTier1 = "upgradecontainer1"
    final val UpgradeContainerTier2 = "upgradecontainer2"
    final val UpgradeContainerTier3 = "upgradecontainer3"
    final val WirelessNetworkCardTier1 = "wlancard1"
    final val WirelessNetworkCardTier2 = "wlancard2"
    final val WorldSensorCard = "worldsensorcard"
    final val Wrench = "wrench"

    def DroneCase(tier: Int): String = ItemUtils.caseNameWithTierSuffix("dronecase", tier)

    def MicrocontrollerCase(tier: Int): String = ItemUtils.caseNameWithTierSuffix("microcontrollercase", tier)

    def TabletCase(tier: Int): String = ItemUtils.caseNameWithTierSuffix("tabletcase", tier)
  }

  object DeviceInfo {

    final val DefaultVendor = "MightyPirates GmbH & Co. KG"
    final val Scummtech = "Scummtech, Inc."

  }

}
