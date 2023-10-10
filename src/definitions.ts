/// <reference types="@capacitor/cli" />
declare module '@capacitor/cli' {
  export interface PluginsConfig {
    SunmiScanHeadPlugin?: {
      /**
       * Auto bind the scan service on app load
       *
       * @default true
       */
      bindOnLoad?: boolean;
    };
  }
}

import type { PluginListenerHandle } from '@capacitor/core';

export enum OutputMode {
    KEYSTROKE = "keystroke",
    DIRECTFILL = "directFill",
    DISABLED = "disabled",
}

export enum ScanMode {
    TRIGGER = "trigger",
    CONTINUOUS = "continuous",
    PULSE = "pulse",
    LONGPRESS = "longPress",
}

export type ScannerModelName = string|"NONE"|"SUPER_N1365_Y1825"|"NLS_2096"|"ZEBRA_4710"|"HONEYWELL_3601"|"HONEYWELL_6603"|"ZEBRA_4750"|"ZEBRA_1350"|"HONEYWELL_6703"|"HONEYWELL_3603"|"NLS_CM47"|"NLS_3108"|"ZEBRA_965"|"SM_SS_1100"|"NLS_CM30"|"HONEYWELL_4603"|"ZEBRA_4770"|"NLS_2596"|"SM_SS_1103"|"SM_SS_1101"|"HONEYWELL_5703"|"UNKNOWN";

export interface SunmiScanHeadPlugin {
  /**
   * bind scan service
   */
  bindService(): Promise<void>;

  /**
   * unbind scan service
   */
  unBindService(): Promise<void>;

  /**
   * Start scanner
   */
  scan(): Promise<void>;

  /**
   * Stop scanner
   */
  stop(): Promise<void>;

  /**
   * Get scanner model
   */
  getScannerModel(): Promise<{ id: number, name: ScannerModelName }>;

  /**
   * Clear scanner configuration (reset to default)
   */
  clearConfig(): Promise<{ cleared: boolean; }>;

  /**
   * Enable or disable trigger button
   */
  setTrigger(options: { enabled: boolean }): Promise<void>;

  /**
   * Play a beep sound
   */
  beep(): Promise<void>;

  /**
   * Vibrate
   */
  vibrate(): Promise<void>;

  /**
   * Prepares transaction for writing settings to scanner
   */
  createWriteContext(): Promise<void>;

  /**
   * Write settings to scanner
   */
  commitWriteContext(): Promise<void>;

  /**
   * Discard transaction for writing settings to scanner
   */
  discardWriteContext(): Promise<void>;

  /**
   * Set output mode
   */
  setOutputMode(options: { mode: OutputMode.DISABLED } | { mode: OutputMode.KEYSTROKE, interval?: number, tab?: boolean, enter?: boolean } | { mode: OutputMode.DIRECTFILL, overwrite?: boolean, tab?: boolean, enter?: boolean, asEvent?: boolean }): Promise<void>;

  /**
   * Set scan mode
   */
  setScanMode(options: { mode: ScanMode.TRIGGER | ScanMode.PULSE, timeout?: number } | { mode: ScanMode.CONTINUOUS | ScanMode.LONGPRESS, sleep?: number, timeout?: number }): Promise<void>;

  /**
   * Enable or disable returning of code type with scan result
   */
  setReturnCodeType(options?: { enabled: boolean }): Promise<void>;

  /**
   * Enable or disable advanced formatting options provided in configuration
   */
  setAdvancedFormatEnabled(options?: { enabled: boolean }): Promise<void>;

  /**
   * Enable or disable sound prompts on scan
   */
  setBeep(options?: { enabled: boolean }): Promise<void>;

  /**
   * Enable or disable vibration prompts on scan
   */
  setVibrate(options?: { enabled: boolean }): Promise<void>;

  /**
   * Enable or disable scan result broadcast
   */
  setOutputBroadcastEnabled(options?: { enabled: boolean }): Promise<void>;

  /**
   * Set broadcast configuration
   */
  setBroadcastConfiguration(options?: {
    scanned_intent?: string,
    start_intent?: string,
    end_intent?: string,
    intent_data_key?: string,
    intent_byte_key?: string
  }): Promise<void>;

  /**
   * Listens for barcode scanner result events.
   */
  addListener(
      eventName: 'onScanResult',
      listenerFunc: (scan: { data: string, source_bytes: string }) => void,
  ): Promise<PluginListenerHandle> & PluginListenerHandle;

  /**
   * Listens for barcode scanner start events.
   */
  addListener(
      eventName: 'onScanStart',
      listenerFunc: () => void,
  ): Promise<PluginListenerHandle> & PluginListenerHandle;

  /**
   * Listens for barcode scanner stop events.
   */
  addListener(
      eventName: 'onScanStop',
      listenerFunc: () => void,
  ): Promise<PluginListenerHandle> & PluginListenerHandle;

  /**
   * Removes all listeners
   */
  removeAllListeners(): Promise<void>;
}
