package com.developerphil.adbidea.adb.command;

public class ClearDataAndRestartWithDebuggerCommand extends CommandList {
    public ClearDataAndRestartWithDebuggerCommand() {
        super(new ClearDataCommand(), new StartDefaultActivityCommand(true));
    }
}
