package com.iridium.iridiumskyblock.configs;

import com.iridium.iridiumskyblock.Role;

import java.util.HashMap;

public class Messages {

    public String reloaded = "%prefix% &7Załadowano ponownie konfigurację.";
    public String noPermission = "%prefix% &7Nie masz do tego uprawnień.";
    public String noIsland = "%prefix% &7Nie posiadasz wyspy.";
    public String playerNoIsland = "%prefix% &7Ten gracz nie posiada wyspy.";
    public String playerOffline = "%prefix% &7Ten gracz jest teraz offline.";
    public String alreadyHaveIsland = "%prefix% &7Już posiadasz wyspę..";
    public String playerAlreadyHaveIsland = "%prefix% &7Ten gracz już posiada wyspę.";
    public String notInYourIsland = "%prefix% &7Ten gracz nie jest członkiem twojej wyspy.";
    public String kickedMember = "%prefix% &7%member% został wyrzucony z twojej wyspy.";
    public String youHaveBeenKicked = "%prefix% &7Zostałeś wyrzucony ze swojej wyspy.";
    public String mustBeAPlayer = "%prefix% &7Musisz być graczem aby wykonać tą komendę.";
    public String mustBeIslandOwner = "%prefix% &7Musisz być właścicielem wyspy aby użyć tej komendy.";
    public String teleporting = "%prefix% &7Teleportacja...";
    public String warpAdded = "%prefix% &7Dodano warpa.";
    public String maxWarpsReached = "%prefix% &7Osiągnięto limit warpów.";
    public String flightDisabled = "%prefix% &7Twoje zdolności latania zostały wyłączone.";
    public String flightEnabled = "%prefix% &7Twoje zdolności latania zostały włączone.";
    public String flightBoosterNotActive = "%prefix% &7Your flight booster is not active.";
    public String notEnoughCrystals = "%prefix% &7You don't have enough island crystals.";
    public String maxLevelReached = "%prefix% &7Osiągnięto maksymalny poziom.";
    public String crystalAmount = "%prefix% &7Masz %crystals% kryształ(ów).";
    public String maxMemberCount = "%prefix% &7Osiągnięto maksymalną liczbę członków..";
    public String spawnerBoosterActive = "%prefix% &7Your spawner booster is already active.";
    public String farmingBoosterActive = "%prefix% &7Your farming booster is already active.";
    public String expBoosterActive = "%prefix% &7Your Experience booster is already active.";
    public String flightBoosterActive = "%prefix% &7Your flight booster is already active.";
    public String noActiveInvites = "%prefix% &7Nie masz żadnych aktywnych zaproszeń do tej wyspy.";
    public String giveCrystals = "%prefix% &7Podarowano graczowi %player% %crystals% kryształ(ów).";
    public String givenCrystals = "%prefix% &7Otrzymano %crystals% kryształ(ów) od %player%.";
    public String removedcrystals = "%prefix% &7Zabrano %crystals% kryształ(ów) graczowi %player%.";
    public String wrongPassword = "%prefix% &7Złe hasło.";
    public String enterPassword = "%prefix% &7Wprowadź hasło.";
    public String teleportingHome = "%prefix% &7Teleportacja do domu...";
    public String playerInvited = "%prefix% &7Zaproszono gracza do dołączenia do twojej wyspy.";
    public String invitedByPlayer = "%prefix% &7Zaproszono Cię do dołączenia do wyspy gracza %player%.";
    public String leftIsland = "%prefix% &7Opuszczasz swoją wyspę.";
    public String regenIsland = "%prefix% &7Regenerowanie twojej wyspy...";
    public String islandValue = "%prefix% &b&l * &7%rank%: &b%value%";
    public String playersIslandIsPrivate = "%prefix% &7Wyspa tego gracza jest prywatna.";
    public String islandNowPrivate = "%prefix% &7Twoja wyspa jest teraz prywatna.";
    public String islandNowPublic = "%prefix% &7Twoja wyspa jest teraz publiczna.";
    public String cantLeaveIfOwner = "%prefix% &7Nie możesz opuścić swojej wyspy gdy jesteś jej właścicielem. Zamiast tego wpisz /is delete.";
    public String cantKickOwner = "%prefix% &7Nie możesz wyrzucić właściciela wyspy.";
    public String cantDemoteOwner = "%prefix% &7Nie możesz zdegradować właściciela wyspy.";
    public String nowBypassing = "%prefix% &7Od teraz ignorujesz ograniczenia wyspy.";
    public String noLongerBypassing = "%prefix% &7Od teraz już nie ignorujesz ograniczeń wysp.";
    public String cantDemoteUser = "%prefix% &7Nie możesz zdegradować tego użytkownika.";
    public String cantPromoteUser = "%prefix% &7Nie możesz awansować tego użytkownika.";
    public String playerPromoted = "%prefix% &7%player% otrzymał(a) promocję do rangi %rank%.";
    public String playerDemoted = "%prefix% &7%player% otrzymał(a) degradację do rangi %rank%.";
    public String setHome = "%prefix% &7Ustawiono położenie domu w tym miejscu.";
    public String isNotSafe = "%prefix% &7To miejsce nie jest bezpieczne.";
    public String helpMessage = "&b&l * &7 %command% : &b %description%";
    public String helpHeader = "&b&lSkyblock: &bPomoc";
    public String transferdOwnership = "%prefix% &7Przekazano własność nad wyspą graczowi %player%.";
    public String bannedFromIsland = "%prefix% &7Zostałeś zbanowany z tej wyspy.";
    public String playerBanned = "%prefix% &7Zbanowano gracza %player% z tej wyspy.";
    public String playerUnBanned = "%prefix% &7Odbanowano gracza %player% z tej wyspy.";
    public String playerJoinedYourIsland = "%prefix% &7%player% dołączył(a) do tej wyspy.";
    public String coopAdded = "%prefix% &7Udzielono graczowi %player% uprawnienia członka wyspy.";
    public String coopGiven = "%prefix% &7Udzielono ci uprawnień członka do wyspy gracza %player%.";
    public String coopTaken = "%prefix% &7Odebrano ci uprawnienia członka dla wyspy gracza %player%.";
    public String coopInvite = "%prefix% &7Zaproszono cię do współpracy nad wyspą gracza %player%.";
    public String coopInviteSent = "%prefix% &7Wysłano zaproszenie do współpraczy nad wyspą gracza %player%.";
    public String islandCreated = "&b&lUtworzono wyspę.";
    public String islandCreatedSubtitle = "";
    public String maxlevelreached = "N/A";
    public String yes = "&a&lTak";
    public String no = "&c&lNie";
    public String changesIslandName = "%prefix% &7%player% zmienił nazwę twojej wyspy na %name%";
    public String missionComplete = "&b&lUkończono misję: &7%mission% Poziom %level%";
    public String rewards = "&b&lNagroda: &7%crystalsReward% kryształ(ów) i $%vaultReward%";
    public String chatFormat = "&b&l%player% &7» %message%";
    public String chatDisabled = "%prefix% &7Chat twojej wyspy został wyłączony.";
    public String chatEnabled = "%prefix% &7Chat twojej wyspy został włączony.";
    public String transferAction = "Przekaż własność graczowi %player%";
    public String resetAction = "Zresetuj twoją wyspę";
    public String deleteAction = "Usuń swoją wyspę";
    public String visitingIsland = "%prefix% &7Teleportowanie na wyspę gracza %player%";
    public String visitedYourIsland = "%prefix% &7%player% odwiedza twoją wyspę.";
    public String cantBuy = "%prefix% &7Nie masz wystarczająco dużo pieniędzy aby to kupić.";
    public String cantSell = "%prefix% &7Nie masz tego przedmiotu na sprzedaż.";
    public String islandInterest = "%prefix% &7Your island interest has been applied giving you %crystals%Crystals $%money% and %exp%Experience.";
    public String helpfooter = "&b<< &7Strona %page% z %maxpage% &b>>";
    public String previousPage = "<<";
    public String nextPage = ">>";
    public String Kick = "Wyrzuć";
    public String Demote = "Zdegraduj";
    public String completed = "Ukończono";
    public String regenCooldown = "%prefix% &7Nie możesz zregenrować wyspy przez %minutes% minut i %seconds% sekund";
    public String createCooldown = "%prefix% &7Nie możesz utworzyć nowej wyspy przez %minutes% minut i %seconds% sekund";
    public String islandDeleted = "%prefix% &7Twoja wyspa została usunięta";
    public String mustBeInIsland = "%prefix% &7Musisz być na swojej wyspie aby to zrobić.";
    public String cannotSellItem = "%prefix% &7Tego przedmiotu nie można sprzedać.";

    public HashMap<Role, String> roles = new HashMap<Role, String>() {{
        for (Role role : Role.values()) {
            put(role, role.name());
        }
    }};

    public HashMap<String, String> permissions = new HashMap<>();
}
