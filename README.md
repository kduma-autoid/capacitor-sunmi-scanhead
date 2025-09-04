# @kduma-autoid/capacitor-sunmi-scanhead

Sunmi Scan Head bindings for Capacitor

Check full documentation here: [opensource.duma.sh/libraries/capacitor/sunmi-scanhead](https://opensource.duma.sh/libraries/capacitor/sunmi-scanhead)

## Install

```bash
npm install @kduma-autoid/capacitor-sunmi-scanhead
npx cap sync
```
## Configuration

You can disable auto binding of the service by setting `bindOnLoad` to `false` in the plugin configuration in `capacitor.config.ts`.

```typescript
/// <reference types="@kduma-autoid/capacitor-sunmi-scanhead" />
import { CapacitorConfig } from '@capacitor/cli';

const config: CapacitorConfig = {
  appId: "com.company.app",
  ...
  plugins: {
    SunmiScanHead: {
      bindOnLoad: true
    }
  }
}
export default config;
```

## API

<docgen-index>

* [`bindService()`](#bindservice)
* [`unBindService()`](#unbindservice)
* [`scan()`](#scan)
* [`stop()`](#stop)
* [`getScannerModel()`](#getscannermodel)
* [`clearConfig()`](#clearconfig)
* [`setTrigger(...)`](#settrigger)
* [`beep()`](#beep)
* [`vibrate()`](#vibrate)
* [`createWriteContext(...)`](#createwritecontext)
* [`commitWriteContext()`](#commitwritecontext)
* [`discardWriteContext()`](#discardwritecontext)
* [`getOutputType()`](#getoutputtype)
* [`setOutputType(...)`](#setoutputtype)
* [`getTriggerMethod()`](#gettriggermethod)
* [`setTriggerMethod(...)`](#settriggermethod)
* [`getScanResultCodeID()`](#getscanresultcodeid)
* [`setScanResultCodeID(...)`](#setscanresultcodeid)
* [`isAdvancedFormatEnabled()`](#isadvancedformatenabled)
* [`setAdvancedFormatEnabled(...)`](#setadvancedformatenabled)
* [`getAdvancedFormats()`](#getadvancedformats)
* [`setAdvancedFormats(...)`](#setadvancedformats)
* [`clearAdvancedFormats()`](#clearadvancedformats)
* [`addAdvancedFormat(...)`](#addadvancedformat)
* [`updateAdvancedFormat(...)`](#updateadvancedformat)
* [`removeAdvancedFormat(...)`](#removeadvancedformat)
* [`isBeep()`](#isbeep)
* [`setBeep(...)`](#setbeep)
* [`isVibrate()`](#isvibrate)
* [`setVibrate(...)`](#setvibrate)
* [`isOutputBroadcastEnabled()`](#isoutputbroadcastenabled)
* [`setOutputBroadcastEnabled(...)`](#setoutputbroadcastenabled)
* [`getBroadcastConfiguration()`](#getbroadcastconfiguration)
* [`setBroadcastConfiguration(...)`](#setbroadcastconfiguration)
* [`getOutputEncodingCode()`](#getoutputencodingcode)
* [`setOutputEncodingCode(...)`](#setoutputencodingcode)
* [`isVirtualFloatingScanButton()`](#isvirtualfloatingscanbutton)
* [`setVirtualFloatingScanButton(...)`](#setvirtualfloatingscanbutton)
* [`getCenterFlagScan()`](#getcenterflagscan)
* [`setCenterFlagScan(...)`](#setcenterflagscan)
* [`isFlash()`](#isflash)
* [`setFlash(...)`](#setflash)
* [`getScene()`](#getscene)
* [`setScene(...)`](#setscene)
* [`isRemoveGroupSeparator()`](#isremovegroupseparator)
* [`setRemoveGroupSeparator(...)`](#setremovegroupseparator)
* [`getPrefix()`](#getprefix)
* [`setPrefix(...)`](#setprefix)
* [`getPrefixCharactersRemoved()`](#getprefixcharactersremoved)
* [`setPrefixCharactersRemoved(...)`](#setprefixcharactersremoved)
* [`getSuffix()`](#getsuffix)
* [`setSuffix(...)`](#setsuffix)
* [`getSuffixCharactersRemoved()`](#getsuffixcharactersremoved)
* [`setSuffixCharactersRemoved(...)`](#setsuffixcharactersremoved)
* [`getBarcodesList()`](#getbarcodeslist)
* [`getBarcode(...)`](#getbarcode)
* [`setBarcode(...)`](#setbarcode)
* [`getBarcodeConfig(...)`](#getbarcodeconfig)
* [`getCheckCharMode(...)`](#getcheckcharmode)
* [`setCheckCharMode(...)`](#setcheckcharmode)
* [`getCheckCharType(...)`](#getcheckchartype)
* [`setCheckCharType(...)`](#setcheckchartype)
* [`getDoubleCode(...)`](#getdoublecode)
* [`setDoubleCode(...)`](#setdoublecode)
* [`getFormatCode(...)`](#getformatcode)
* [`setFormatCode(...)`](#setformatcode)
* [`getInverseCode(...)`](#getinversecode)
* [`setInverseCode(...)`](#setinversecode)
* [`isExtendCode1(...)`](#isextendcode1)
* [`setExtendCode1(...)`](#setextendcode1)
* [`isExtendCode2(...)`](#isextendcode2)
* [`setExtendCode2(...)`](#setextendcode2)
* [`isExtendToCode(...)`](#isextendtocode)
* [`setExtendToCode(...)`](#setextendtocode)
* [`isMicroCode(...)`](#ismicrocode)
* [`setMicroCode(...)`](#setmicrocode)
* [`isStartEndType(...)`](#isstartendtype)
* [`setStartEndType(...)`](#setstartendtype)
* [`isSystemCharZero(...)`](#issystemcharzero)
* [`setSystemCharZero(...)`](#setsystemcharzero)
* [`getMaxLen(...)`](#getmaxlen)
* [`setMaxLen(...)`](#setmaxlen)
* [`getMinLen(...)`](#getminlen)
* [`setMinLen(...)`](#setminlen)
* [`getStartEndFormat(...)`](#getstartendformat)
* [`setStartEndFormat(...)`](#setstartendformat)
* [`addListener('onScanResult', ...)`](#addlisteneronscanresult)
* [`addListener('onScanStart', ...)`](#addlisteneronscanstart)
* [`addListener('onScanStop', ...)`](#addlisteneronscanstop)
* [`removeAllListeners()`](#removealllisteners)
* [Interfaces](#interfaces)
* [Type Aliases](#type-aliases)
* [Enums](#enums)

</docgen-index>

<docgen-api>
<!--Update the source file JSDoc comments and rerun docgen to update the docs below-->

### bindService()

```typescript
bindService() => Promise<void>
```

bind scan service

--------------------


### unBindService()

```typescript
unBindService() => Promise<void>
```

unbind scan service

--------------------


### scan()

```typescript
scan() => Promise<void>
```

Start scanner

--------------------


### stop()

```typescript
stop() => Promise<void>
```

Stop scanner

--------------------


### getScannerModel()

```typescript
getScannerModel() => Promise<GetScannerModelResponse>
```

Get scanner model

**Returns:** <code>Promise&lt;<a href="#getscannermodelresponse">GetScannerModelResponse</a>&gt;</code>

--------------------


### clearConfig()

```typescript
clearConfig() => Promise<ClearConfigResponse>
```

Clear scanner configuration (reset to default)

**Returns:** <code>Promise&lt;<a href="#clearconfigresponse">ClearConfigResponse</a>&gt;</code>

--------------------


### setTrigger(...)

```typescript
setTrigger(options?: SetTriggerOptions | undefined) => Promise<void>
```

Enable or disable trigger button

| Param         | Type                                                            |
| ------------- | --------------------------------------------------------------- |
| **`options`** | <code><a href="#settriggeroptions">SetTriggerOptions</a></code> |

--------------------


### beep()

```typescript
beep() => Promise<void>
```

Play a beep sound

--------------------


### vibrate()

```typescript
vibrate() => Promise<void>
```

Vibrate

--------------------


### createWriteContext(...)

```typescript
createWriteContext(options?: CreateWriteContextOptions | undefined) => Promise<void>
```

Prepares transaction for writing settings to scanner

| Param         | Type                                                                            |
| ------------- | ------------------------------------------------------------------------------- |
| **`options`** | <code><a href="#createwritecontextoptions">CreateWriteContextOptions</a></code> |

--------------------


### commitWriteContext()

```typescript
commitWriteContext() => Promise<void>
```

Write settings to scanner

--------------------


### discardWriteContext()

```typescript
discardWriteContext() => Promise<void>
```

Discard transaction for writing settings to scanner

--------------------


### getOutputType()

```typescript
getOutputType() => Promise<GetOutputTypeResponse>
```

Gets current output mode

**Returns:** <code>Promise&lt;<a href="#getoutputtyperesponse">GetOutputTypeResponse</a>&gt;</code>

--------------------


### setOutputType(...)

```typescript
setOutputType(options: SetOutputTypeOptions) => Promise<void>
```

Set output mode

| Param         | Type                                                                  |
| ------------- | --------------------------------------------------------------------- |
| **`options`** | <code><a href="#setoutputtypeoptions">SetOutputTypeOptions</a></code> |

--------------------


### getTriggerMethod()

```typescript
getTriggerMethod() => Promise<GetTriggerMethodResponse>
```

Gets current scan mode

**Returns:** <code>Promise&lt;<a href="#gettriggermethodresponse">GetTriggerMethodResponse</a>&gt;</code>

--------------------


### setTriggerMethod(...)

```typescript
setTriggerMethod(options: SetTriggerMethodOptions) => Promise<void>
```

Set scan mode

| Param         | Type                                                                        |
| ------------- | --------------------------------------------------------------------------- |
| **`options`** | <code><a href="#settriggermethodoptions">SetTriggerMethodOptions</a></code> |

--------------------


### getScanResultCodeID()

```typescript
getScanResultCodeID() => Promise<GetScanResultCodeIDResponse>
```

Gets current variant of code type returned with scan result

**Returns:** <code>Promise&lt;<a href="#getscanresultcodeidresponse">GetScanResultCodeIDResponse</a>&gt;</code>

--------------------


### setScanResultCodeID(...)

```typescript
setScanResultCodeID(options?: SetScanResultCodeIDOptions | undefined) => Promise<void>
```

Selects variant of code type returned with scan result

| Param         | Type                                                                              |
| ------------- | --------------------------------------------------------------------------------- |
| **`options`** | <code><a href="#setscanresultcodeidoptions">SetScanResultCodeIDOptions</a></code> |

--------------------


### isAdvancedFormatEnabled()

```typescript
isAdvancedFormatEnabled() => Promise<IsAdvancedFormatEnabledResponse>
```

Checks if advanced formatting options provided in configuration are enabled

**Returns:** <code>Promise&lt;<a href="#isadvancedformatenabledresponse">IsAdvancedFormatEnabledResponse</a>&gt;</code>

--------------------


### setAdvancedFormatEnabled(...)

```typescript
setAdvancedFormatEnabled(options?: SetAdvancedFormatEnabledOptions | undefined) => Promise<void>
```

Enable or disable advanced formatting options provided in configuration

| Param         | Type                                                                                        |
| ------------- | ------------------------------------------------------------------------------------------- |
| **`options`** | <code><a href="#setadvancedformatenabledoptions">SetAdvancedFormatEnabledOptions</a></code> |

--------------------


### getAdvancedFormats()

```typescript
getAdvancedFormats() => Promise<GetAdvancedFormatEnabledResponse>
```

Gets advanced formatting options (character replacement arrays) provided in configuration

**Returns:** <code>Promise&lt;<a href="#getadvancedformatenabledresponse">GetAdvancedFormatEnabledResponse</a>&gt;</code>

--------------------


### setAdvancedFormats(...)

```typescript
setAdvancedFormats(options: SetAdvancedFormatOptions) => Promise<void>
```

Sets advanced formatting options (character replacement arrays) provided in configuration

| Param         | Type                                                                          |
| ------------- | ----------------------------------------------------------------------------- |
| **`options`** | <code><a href="#setadvancedformatoptions">SetAdvancedFormatOptions</a></code> |

--------------------


### clearAdvancedFormats()

```typescript
clearAdvancedFormats() => Promise<void>
```

Clears all advanced formatting options

--------------------


### addAdvancedFormat(...)

```typescript
addAdvancedFormat(options: AddAdvancedFormatOptions) => Promise<void>
```

Adds new advanced formatting option

| Param         | Type                                                                          |
| ------------- | ----------------------------------------------------------------------------- |
| **`options`** | <code><a href="#addadvancedformatoptions">AddAdvancedFormatOptions</a></code> |

--------------------


### updateAdvancedFormat(...)

```typescript
updateAdvancedFormat(options: UpdateAdvancedFormatOptions) => Promise<void>
```

Updates advanced formatting option

| Param         | Type                                                                                |
| ------------- | ----------------------------------------------------------------------------------- |
| **`options`** | <code><a href="#updateadvancedformatoptions">UpdateAdvancedFormatOptions</a></code> |

--------------------


### removeAdvancedFormat(...)

```typescript
removeAdvancedFormat(options: RemoveAdvancedFormatOptions) => Promise<void>
```

Removes advanced formatting option

| Param         | Type                                                                                |
| ------------- | ----------------------------------------------------------------------------------- |
| **`options`** | <code><a href="#removeadvancedformatoptions">RemoveAdvancedFormatOptions</a></code> |

--------------------


### isBeep()

```typescript
isBeep() => Promise<IsBeepResponse>
```

Checks if sound prompts on scan are enabled

**Returns:** <code>Promise&lt;<a href="#isbeepresponse">IsBeepResponse</a>&gt;</code>

--------------------


### setBeep(...)

```typescript
setBeep(options?: SetBeepOptions | undefined) => Promise<void>
```

Enable or disable sound prompts on scan

| Param         | Type                                                      |
| ------------- | --------------------------------------------------------- |
| **`options`** | <code><a href="#setbeepoptions">SetBeepOptions</a></code> |

--------------------


### isVibrate()

```typescript
isVibrate() => Promise<IsVibrateResponse>
```

Checks if vibration prompts on scan are enabled

**Returns:** <code>Promise&lt;<a href="#isvibrateresponse">IsVibrateResponse</a>&gt;</code>

--------------------


### setVibrate(...)

```typescript
setVibrate(options?: SetVibrateOptions | undefined) => Promise<void>
```

Enable or disable vibration prompts on scan

| Param         | Type                                                            |
| ------------- | --------------------------------------------------------------- |
| **`options`** | <code><a href="#setvibrateoptions">SetVibrateOptions</a></code> |

--------------------


### isOutputBroadcastEnabled()

```typescript
isOutputBroadcastEnabled() => Promise<IsOutputBroadcastEnableResponse>
```

Checks if scan result broadcast is enabled

**Returns:** <code>Promise&lt;<a href="#isoutputbroadcastenableresponse">IsOutputBroadcastEnableResponse</a>&gt;</code>

--------------------


### setOutputBroadcastEnabled(...)

```typescript
setOutputBroadcastEnabled(options?: SetOutputBroadcastEnabledOutput | undefined) => Promise<void>
```

Enable or disable scan result broadcast

| Param         | Type                                                                                        |
| ------------- | ------------------------------------------------------------------------------------------- |
| **`options`** | <code><a href="#setoutputbroadcastenabledoutput">SetOutputBroadcastEnabledOutput</a></code> |

--------------------


### getBroadcastConfiguration()

```typescript
getBroadcastConfiguration() => Promise<GetBroadcastConfigurationResponse>
```

Get broadcast configuration

**Warning: This method only reads what you have wrote to write context, as there is no way to read those settings from system at this moment** (If you know how, please make a PR)

**Returns:** <code>Promise&lt;<a href="#getbroadcastconfigurationresponse">GetBroadcastConfigurationResponse</a>&gt;</code>

--------------------


### setBroadcastConfiguration(...)

```typescript
setBroadcastConfiguration(options?: SetBroadcastConfigurationOptions | undefined) => Promise<void>
```

Set broadcast configuration

| Param         | Type                                                                                          |
| ------------- | --------------------------------------------------------------------------------------------- |
| **`options`** | <code><a href="#setbroadcastconfigurationoptions">SetBroadcastConfigurationOptions</a></code> |

--------------------


### getOutputEncodingCode()

```typescript
getOutputEncodingCode() => Promise<GetOutputEncodingCodeResponse>
```

Get current output encoding/character set setting

**Returns:** <code>Promise&lt;<a href="#getoutputencodingcoderesponse">GetOutputEncodingCodeResponse</a>&gt;</code>

--------------------


### setOutputEncodingCode(...)

```typescript
setOutputEncodingCode(options?: SetOutputEncodingCodeOptions | undefined) => Promise<void>
```

Set output encoding/character set setting

| Param         | Type                                                                                  |
| ------------- | ------------------------------------------------------------------------------------- |
| **`options`** | <code><a href="#setoutputencodingcodeoptions">SetOutputEncodingCodeOptions</a></code> |

--------------------


### isVirtualFloatingScanButton()

```typescript
isVirtualFloatingScanButton() => Promise<IsVirtualFloatingScanButtonResponse>
```

Checks if virtual floating scan button is enabled

**Returns:** <code>Promise&lt;<a href="#isvirtualfloatingscanbuttonresponse">IsVirtualFloatingScanButtonResponse</a>&gt;</code>

--------------------


### setVirtualFloatingScanButton(...)

```typescript
setVirtualFloatingScanButton(options?: SetVirtualFloatingScanButtonOptions | undefined) => Promise<void>
```

Enable or disable the virtual floating scan button

| Param         | Type                                                                                                |
| ------------- | --------------------------------------------------------------------------------------------------- |
| **`options`** | <code><a href="#setvirtualfloatingscanbuttonoptions">SetVirtualFloatingScanButtonOptions</a></code> |

--------------------


### getCenterFlagScan()

```typescript
getCenterFlagScan() => Promise<GetCenterFlagScanResponse>
```

Gets current center point decoding mode

**Returns:** <code>Promise&lt;<a href="#getcenterflagscanresponse">GetCenterFlagScanResponse</a>&gt;</code>

--------------------


### setCenterFlagScan(...)

```typescript
setCenterFlagScan(options?: SetCenterFlagScanOptions | undefined) => Promise<void>
```

Sets center point decoding mode

| Param         | Type                                                                          |
| ------------- | ----------------------------------------------------------------------------- |
| **`options`** | <code><a href="#setcenterflagscanoptions">SetCenterFlagScanOptions</a></code> |

--------------------


### isFlash()

```typescript
isFlash() => Promise<IsFlashResponse>
```

Checks if scanner illumination is enabled

**Returns:** <code>Promise&lt;<a href="#isflashresponse">IsFlashResponse</a>&gt;</code>

--------------------


### setFlash(...)

```typescript
setFlash(options?: SetFlashOptions | undefined) => Promise<void>
```

Controls scanner illumination

Hardware support limited

| Param         | Type                                                        |
| ------------- | ----------------------------------------------------------- |
| **`options`** | <code><a href="#setflashoptions">SetFlashOptions</a></code> |

--------------------


### getScene()

```typescript
getScene() => Promise<GetSceneResponse>
```

Gets current scanning scene preset

**Returns:** <code>Promise&lt;<a href="#getsceneresponse">GetSceneResponse</a>&gt;</code>

--------------------


### setScene(...)

```typescript
setScene(options?: SetSceneOptions | undefined) => Promise<void>
```

Sets scanning scene preset

Hardware support limited

| Param         | Type                                                        |
| ------------- | ----------------------------------------------------------- |
| **`options`** | <code><a href="#setsceneoptions">SetSceneOptions</a></code> |

--------------------


### isRemoveGroupSeparator()

```typescript
isRemoveGroupSeparator() => Promise<IsRemoveGroupSeparatorResponse>
```

Checks if the removal of group separator characters is enabled

**Returns:** <code>Promise&lt;<a href="#isremovegroupseparatorresponse">IsRemoveGroupSeparatorResponse</a>&gt;</code>

--------------------


### setRemoveGroupSeparator(...)

```typescript
setRemoveGroupSeparator(options?: SetRemoveGroupSeparatorOptions | undefined) => Promise<void>
```

Enables or disables the removal of group separator characters

Hardware support limited

| Param         | Type                                                                                      |
| ------------- | ----------------------------------------------------------------------------------------- |
| **`options`** | <code><a href="#setremovegroupseparatoroptions">SetRemoveGroupSeparatorOptions</a></code> |

--------------------


### getPrefix()

```typescript
getPrefix() => Promise<GetPrefixResponse>
```

Gets the prefix which is prepended to the barcode data

**Returns:** <code>Promise&lt;<a href="#getprefixresponse">GetPrefixResponse</a>&gt;</code>

--------------------


### setPrefix(...)

```typescript
setPrefix(options?: SetPrefixOptions | undefined) => Promise<void>
```

Sets the prefix to be prepended to the barcode data

| Param         | Type                                                          |
| ------------- | ------------------------------------------------------------- |
| **`options`** | <code><a href="#setprefixoptions">SetPrefixOptions</a></code> |

--------------------


### getPrefixCharactersRemoved()

```typescript
getPrefixCharactersRemoved() => Promise<GetPrefixCharactersRemovedResponse>
```

Gets the number of characters which are removed from the beginning of the barcode data

**Returns:** <code>Promise&lt;<a href="#getprefixcharactersremovedresponse">GetPrefixCharactersRemovedResponse</a>&gt;</code>

--------------------


### setPrefixCharactersRemoved(...)

```typescript
setPrefixCharactersRemoved(options?: SetPrefixCharactersRemovedOptions | undefined) => Promise<void>
```

Sets the prefix characters to be removed from the barcode data

Hardware support limited

| Param         | Type                                                                                            |
| ------------- | ----------------------------------------------------------------------------------------------- |
| **`options`** | <code><a href="#setprefixcharactersremovedoptions">SetPrefixCharactersRemovedOptions</a></code> |

--------------------


### getSuffix()

```typescript
getSuffix() => Promise<GetSuffixResponse>
```

Gets the suffix which is appended to the barcode data

**Returns:** <code>Promise&lt;<a href="#getsuffixresponse">GetSuffixResponse</a>&gt;</code>

--------------------


### setSuffix(...)

```typescript
setSuffix(options?: SetSuffixOptions | undefined) => Promise<void>
```

Sets the suffix to be appended to the barcode data

| Param         | Type                                                          |
| ------------- | ------------------------------------------------------------- |
| **`options`** | <code><a href="#setsuffixoptions">SetSuffixOptions</a></code> |

--------------------


### getSuffixCharactersRemoved()

```typescript
getSuffixCharactersRemoved() => Promise<GetSuffixCharactersRemovedResponse>
```

Gets the number of characters which are removed from the end of the barcode data

**Returns:** <code>Promise&lt;<a href="#getsuffixcharactersremovedresponse">GetSuffixCharactersRemovedResponse</a>&gt;</code>

--------------------


### setSuffixCharactersRemoved(...)

```typescript
setSuffixCharactersRemoved(options?: SetSuffixCharactersRemovedOptions | undefined) => Promise<void>
```

Sets the suffix characters to be removed from the barcode data

Hardware support limited

| Param         | Type                                                                                            |
| ------------- | ----------------------------------------------------------------------------------------------- |
| **`options`** | <code><a href="#setsuffixcharactersremovedoptions">SetSuffixCharactersRemovedOptions</a></code> |

--------------------


### getBarcodesList()

```typescript
getBarcodesList() => Promise<GetBarcodesListResponse>
```

Gets the list of barcodes, and its statuses.

**Returns:** <code>Promise&lt;<a href="#getbarcodeslistresponse">GetBarcodesListResponse</a>&gt;</code>

--------------------


### getBarcode(...)

```typescript
getBarcode(options: GetBarcodeOptions) => Promise<GetBarcodeResponse>
```

Gets the status of a barcode

| Param         | Type                                                            |
| ------------- | --------------------------------------------------------------- |
| **`options`** | <code><a href="#getbarcodeoptions">GetBarcodeOptions</a></code> |

**Returns:** <code>Promise&lt;<a href="#getbarcoderesponse">GetBarcodeResponse</a>&gt;</code>

--------------------


### setBarcode(...)

```typescript
setBarcode(options: SetBarcodeOptions) => Promise<void>
```

Sets the status of a barcode

| Param         | Type                                                            |
| ------------- | --------------------------------------------------------------- |
| **`options`** | <code><a href="#setbarcodeoptions">SetBarcodeOptions</a></code> |

--------------------


### getBarcodeConfig(...)

```typescript
getBarcodeConfig(options: GetBarcodeConfigOptions) => Promise<GetBarcodeConfigResponse>
```

Gets the configuration of a barcode symbology

| Param         | Type                                                                        |
| ------------- | --------------------------------------------------------------------------- |
| **`options`** | <code><a href="#getbarcodeconfigoptions">GetBarcodeConfigOptions</a></code> |

**Returns:** <code>Promise&lt;<a href="#getbarcodeconfigresponse">GetBarcodeConfigResponse</a>&gt;</code>

--------------------


### getCheckCharMode(...)

```typescript
getCheckCharMode(options: GetCheckCharModeOptions) => Promise<GetCheckCharModeResponse>
```

| Param         | Type                                                                        |
| ------------- | --------------------------------------------------------------------------- |
| **`options`** | <code><a href="#getcheckcharmodeoptions">GetCheckCharModeOptions</a></code> |

**Returns:** <code>Promise&lt;<a href="#getcheckcharmoderesponse">GetCheckCharModeResponse</a>&gt;</code>

--------------------


### setCheckCharMode(...)

```typescript
setCheckCharMode(options: SetCheckCharModeOptions) => Promise<void>
```

| Param         | Type                                                                        |
| ------------- | --------------------------------------------------------------------------- |
| **`options`** | <code><a href="#setcheckcharmodeoptions">SetCheckCharModeOptions</a></code> |

--------------------


### getCheckCharType(...)

```typescript
getCheckCharType(options: GetCheckCharTypeOptions) => Promise<GetCheckCharTypeResponse>
```

| Param         | Type                                                                        |
| ------------- | --------------------------------------------------------------------------- |
| **`options`** | <code><a href="#getcheckchartypeoptions">GetCheckCharTypeOptions</a></code> |

**Returns:** <code>Promise&lt;<a href="#getcheckchartyperesponse">GetCheckCharTypeResponse</a>&gt;</code>

--------------------


### setCheckCharType(...)

```typescript
setCheckCharType(options: SetCheckCharTypeOptions) => Promise<void>
```

| Param         | Type                                                                        |
| ------------- | --------------------------------------------------------------------------- |
| **`options`** | <code><a href="#setcheckchartypeoptions">SetCheckCharTypeOptions</a></code> |

--------------------


### getDoubleCode(...)

```typescript
getDoubleCode(options: GetDoubleCodeOptions) => Promise<GetDoubleCodeResponse>
```

| Param         | Type                                                                  |
| ------------- | --------------------------------------------------------------------- |
| **`options`** | <code><a href="#getdoublecodeoptions">GetDoubleCodeOptions</a></code> |

**Returns:** <code>Promise&lt;<a href="#getdoublecoderesponse">GetDoubleCodeResponse</a>&gt;</code>

--------------------


### setDoubleCode(...)

```typescript
setDoubleCode(options: SetDoubleCodeOptions) => Promise<void>
```

| Param         | Type                                                                  |
| ------------- | --------------------------------------------------------------------- |
| **`options`** | <code><a href="#setdoublecodeoptions">SetDoubleCodeOptions</a></code> |

--------------------


### getFormatCode(...)

```typescript
getFormatCode(options: GetFormatCodeOptions) => Promise<GetFormatCodeResponse>
```

| Param         | Type                                                                  |
| ------------- | --------------------------------------------------------------------- |
| **`options`** | <code><a href="#getformatcodeoptions">GetFormatCodeOptions</a></code> |

**Returns:** <code>Promise&lt;<a href="#getformatcoderesponse">GetFormatCodeResponse</a>&gt;</code>

--------------------


### setFormatCode(...)

```typescript
setFormatCode(options: SetFormatCodeOptions) => Promise<void>
```

| Param         | Type                                                                  |
| ------------- | --------------------------------------------------------------------- |
| **`options`** | <code><a href="#setformatcodeoptions">SetFormatCodeOptions</a></code> |

--------------------


### getInverseCode(...)

```typescript
getInverseCode(options: GetInverseCodeOptions) => Promise<GetInverseCodeResponse>
```

| Param         | Type                                                                    |
| ------------- | ----------------------------------------------------------------------- |
| **`options`** | <code><a href="#getinversecodeoptions">GetInverseCodeOptions</a></code> |

**Returns:** <code>Promise&lt;<a href="#getinversecoderesponse">GetInverseCodeResponse</a>&gt;</code>

--------------------


### setInverseCode(...)

```typescript
setInverseCode(options: SetInverseCodeOptions) => Promise<void>
```

| Param         | Type                                                                    |
| ------------- | ----------------------------------------------------------------------- |
| **`options`** | <code><a href="#setinversecodeoptions">SetInverseCodeOptions</a></code> |

--------------------


### isExtendCode1(...)

```typescript
isExtendCode1(options: IsExtendCode1Options) => Promise<IsExtendCode1Response>
```

| Param         | Type                                                                  |
| ------------- | --------------------------------------------------------------------- |
| **`options`** | <code><a href="#isextendcode1options">IsExtendCode1Options</a></code> |

**Returns:** <code>Promise&lt;<a href="#isextendcode1response">IsExtendCode1Response</a>&gt;</code>

--------------------


### setExtendCode1(...)

```typescript
setExtendCode1(options: SetExtendCode1Options) => Promise<void>
```

| Param         | Type                                                                    |
| ------------- | ----------------------------------------------------------------------- |
| **`options`** | <code><a href="#setextendcode1options">SetExtendCode1Options</a></code> |

--------------------


### isExtendCode2(...)

```typescript
isExtendCode2(options: IsExtendCode2Options) => Promise<IsExtendCode2Response>
```

| Param         | Type                                                                  |
| ------------- | --------------------------------------------------------------------- |
| **`options`** | <code><a href="#isextendcode2options">IsExtendCode2Options</a></code> |

**Returns:** <code>Promise&lt;<a href="#isextendcode2response">IsExtendCode2Response</a>&gt;</code>

--------------------


### setExtendCode2(...)

```typescript
setExtendCode2(options: SetExtendCode2Options) => Promise<void>
```

| Param         | Type                                                                    |
| ------------- | ----------------------------------------------------------------------- |
| **`options`** | <code><a href="#setextendcode2options">SetExtendCode2Options</a></code> |

--------------------


### isExtendToCode(...)

```typescript
isExtendToCode(options: IsExtendToCodeOptions) => Promise<IsExtendToCodeResponse>
```

| Param         | Type                                                                    |
| ------------- | ----------------------------------------------------------------------- |
| **`options`** | <code><a href="#isextendtocodeoptions">IsExtendToCodeOptions</a></code> |

**Returns:** <code>Promise&lt;<a href="#isextendtocoderesponse">IsExtendToCodeResponse</a>&gt;</code>

--------------------


### setExtendToCode(...)

```typescript
setExtendToCode(options: SetExtendToCodeOptions) => Promise<void>
```

| Param         | Type                                                                      |
| ------------- | ------------------------------------------------------------------------- |
| **`options`** | <code><a href="#setextendtocodeoptions">SetExtendToCodeOptions</a></code> |

--------------------


### isMicroCode(...)

```typescript
isMicroCode(options: IsMicroCodeOptions) => Promise<IsMicroCodeResponse>
```

| Param         | Type                                                              |
| ------------- | ----------------------------------------------------------------- |
| **`options`** | <code><a href="#ismicrocodeoptions">IsMicroCodeOptions</a></code> |

**Returns:** <code>Promise&lt;<a href="#ismicrocoderesponse">IsMicroCodeResponse</a>&gt;</code>

--------------------


### setMicroCode(...)

```typescript
setMicroCode(options: SetMicroCodeOptions) => Promise<void>
```

| Param         | Type                                                                |
| ------------- | ------------------------------------------------------------------- |
| **`options`** | <code><a href="#setmicrocodeoptions">SetMicroCodeOptions</a></code> |

--------------------


### isStartEndType(...)

```typescript
isStartEndType(options: IsStartEndTypeOptions) => Promise<IsStartEndTypeResponse>
```

| Param         | Type                                                                    |
| ------------- | ----------------------------------------------------------------------- |
| **`options`** | <code><a href="#isstartendtypeoptions">IsStartEndTypeOptions</a></code> |

**Returns:** <code>Promise&lt;<a href="#isstartendtyperesponse">IsStartEndTypeResponse</a>&gt;</code>

--------------------


### setStartEndType(...)

```typescript
setStartEndType(options: SetStartEndTypeOptions) => Promise<void>
```

| Param         | Type                                                                      |
| ------------- | ------------------------------------------------------------------------- |
| **`options`** | <code><a href="#setstartendtypeoptions">SetStartEndTypeOptions</a></code> |

--------------------


### isSystemCharZero(...)

```typescript
isSystemCharZero(options: IsSystemCharZeroOptions) => Promise<IsSystemCharZeroResponse>
```

| Param         | Type                                                                        |
| ------------- | --------------------------------------------------------------------------- |
| **`options`** | <code><a href="#issystemcharzerooptions">IsSystemCharZeroOptions</a></code> |

**Returns:** <code>Promise&lt;<a href="#issystemcharzeroresponse">IsSystemCharZeroResponse</a>&gt;</code>

--------------------


### setSystemCharZero(...)

```typescript
setSystemCharZero(options: SetSystemCharZeroOptions) => Promise<void>
```

| Param         | Type                                                                          |
| ------------- | ----------------------------------------------------------------------------- |
| **`options`** | <code><a href="#setsystemcharzerooptions">SetSystemCharZeroOptions</a></code> |

--------------------


### getMaxLen(...)

```typescript
getMaxLen(options: GetMaxLenOptions) => Promise<GetMaxLenResponse>
```

| Param         | Type                                                          |
| ------------- | ------------------------------------------------------------- |
| **`options`** | <code><a href="#getmaxlenoptions">GetMaxLenOptions</a></code> |

**Returns:** <code>Promise&lt;<a href="#getmaxlenresponse">GetMaxLenResponse</a>&gt;</code>

--------------------


### setMaxLen(...)

```typescript
setMaxLen(options: SetMaxLenOptions) => Promise<void>
```

| Param         | Type                                                          |
| ------------- | ------------------------------------------------------------- |
| **`options`** | <code><a href="#setmaxlenoptions">SetMaxLenOptions</a></code> |

--------------------


### getMinLen(...)

```typescript
getMinLen(options: GetMinLenOptions) => Promise<GetMinLenResponse>
```

| Param         | Type                                                          |
| ------------- | ------------------------------------------------------------- |
| **`options`** | <code><a href="#getminlenoptions">GetMinLenOptions</a></code> |

**Returns:** <code>Promise&lt;<a href="#getminlenresponse">GetMinLenResponse</a>&gt;</code>

--------------------


### setMinLen(...)

```typescript
setMinLen(options: SetMinLenOptions) => Promise<void>
```

| Param         | Type                                                          |
| ------------- | ------------------------------------------------------------- |
| **`options`** | <code><a href="#setminlenoptions">SetMinLenOptions</a></code> |

--------------------


### getStartEndFormat(...)

```typescript
getStartEndFormat(options: GetStartEndFormatOptions) => Promise<GetStartEndFormatResponse>
```

| Param         | Type                                                                          |
| ------------- | ----------------------------------------------------------------------------- |
| **`options`** | <code><a href="#getstartendformatoptions">GetStartEndFormatOptions</a></code> |

**Returns:** <code>Promise&lt;<a href="#getstartendformatresponse">GetStartEndFormatResponse</a>&gt;</code>

--------------------


### setStartEndFormat(...)

```typescript
setStartEndFormat(options: SetStartEndFormatOptions) => Promise<void>
```

| Param         | Type                                                                          |
| ------------- | ----------------------------------------------------------------------------- |
| **`options`** | <code><a href="#setstartendformatoptions">SetStartEndFormatOptions</a></code> |

--------------------


### addListener('onScanResult', ...)

```typescript
addListener(eventName: 'onScanResult', listenerFunc: OnScanResultListener) => Promise<PluginListenerHandle>
```

Listens for barcode scanner result events.

| Param              | Type                                                                  |
| ------------------ | --------------------------------------------------------------------- |
| **`eventName`**    | <code>'onScanResult'</code>                                           |
| **`listenerFunc`** | <code><a href="#onscanresultlistener">OnScanResultListener</a></code> |

**Returns:** <code>Promise&lt;<a href="#pluginlistenerhandle">PluginListenerHandle</a>&gt;</code>

--------------------


### addListener('onScanStart', ...)

```typescript
addListener(eventName: 'onScanStart', listenerFunc: OnScanStartListener) => Promise<PluginListenerHandle>
```

Listens for barcode scanner start events.

| Param              | Type                                                                |
| ------------------ | ------------------------------------------------------------------- |
| **`eventName`**    | <code>'onScanStart'</code>                                          |
| **`listenerFunc`** | <code><a href="#onscanstartlistener">OnScanStartListener</a></code> |

**Returns:** <code>Promise&lt;<a href="#pluginlistenerhandle">PluginListenerHandle</a>&gt;</code>

--------------------


### addListener('onScanStop', ...)

```typescript
addListener(eventName: 'onScanStop', listenerFunc: OnScanStopListener) => Promise<PluginListenerHandle>
```

Listens for barcode scanner stop events.

| Param              | Type                                                              |
| ------------------ | ----------------------------------------------------------------- |
| **`eventName`**    | <code>'onScanStop'</code>                                         |
| **`listenerFunc`** | <code><a href="#onscanstoplistener">OnScanStopListener</a></code> |

**Returns:** <code>Promise&lt;<a href="#pluginlistenerhandle">PluginListenerHandle</a>&gt;</code>

--------------------


### removeAllListeners()

```typescript
removeAllListeners() => Promise<void>
```

Removes all listeners

--------------------


### Interfaces


#### GetScannerModelResponse

| Prop       | Type                                                          | Description                             |
| ---------- | ------------------------------------------------------------- | --------------------------------------- |
| **`id`**   | <code>number</code>                                           | Numeric identifier of the scanner model |
| **`name`** | <code><a href="#scannermodelname">ScannerModelName</a></code> | String identifier of the scanner model  |


#### ClearConfigResponse

| Prop          | Type                 | Description             |
| ------------- | -------------------- | ----------------------- |
| **`cleared`** | <code>boolean</code> | Status of the operation |


#### SetTriggerOptions

| Prop          | Type                 | Description                      | Default           |
| ------------- | -------------------- | -------------------------------- | ----------------- |
| **`enabled`** | <code>boolean</code> | Enable or disable trigger button | <code>true</code> |


#### CreateWriteContextOptions

| Prop       | Type                                                                                | Description                                   | Default                                                            |
| ---------- | ----------------------------------------------------------------------------------- | --------------------------------------------- | ------------------------------------------------------------------ |
| **`type`** | <code><a href="#writecontexttype">WriteContextType</a> \| WriteContextType[]</code> | Selects write context type you want to create | <code>[WriteContextType.Service, WriteContextType.Decoders]</code> |


#### GetOutputTypeDisabledResponse

| Prop       | Type                                                       | Description      |
| ---------- | ---------------------------------------------------------- | ---------------- |
| **`mode`** | <code><a href="#outputmode">OutputMode.Disabled</a></code> | No direct output |


#### GetOutputTypeKeystrokeResponse

| Prop           | Type                                                        | Description                                                       |
| -------------- | ----------------------------------------------------------- | ----------------------------------------------------------------- |
| **`mode`**     | <code><a href="#outputmode">OutputMode.Keystroke</a></code> | Virtual Keyboard output                                           |
| **`interval`** | <code>number</code>                                         | Time to sleep between keystrokes                                  |
| **`tab`**      | <code>boolean</code>                                        | Send a tab keystroke after the barcode                            |
| **`enter`**    | <code>boolean</code>                                        | Send an enter keystroke after the barcode                         |
| **`space`**    | <code>boolean</code>                                        | Send a space keystroke after the barcode Hardware support limited |


#### GetOutputTypeDirectFillResponse

| Prop          | Type                                                                                                                       | Description                                                       |
| ------------- | -------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------- |
| **`mode`**    | <code><a href="#outputmode">OutputMode.DirectFill</a> \| <a href="#outputmode">OutputMode.DirectFillWithReplace</a></code> | Fill in EditText directly                                         |
| **`tab`**     | <code>boolean</code>                                                                                                       | Send a tab keystroke after the barcode                            |
| **`enter`**   | <code>boolean</code>                                                                                                       | Send an enter keystroke after the barcode                         |
| **`space`**   | <code>boolean</code>                                                                                                       | Send a space keystroke after the barcode Hardware support limited |
| **`asEvent`** | <code>boolean</code>                                                                                                       | Convert characters into keys                                      |


#### SetOutputTypeDisabledOptions

| Prop       | Type                                                       | Description      |
| ---------- | ---------------------------------------------------------- | ---------------- |
| **`mode`** | <code><a href="#outputmode">OutputMode.Disabled</a></code> | No direct output |


#### SetOutputTypeKeystrokeOptions

| Prop           | Type                                                        | Description                                                       | Default            |
| -------------- | ----------------------------------------------------------- | ----------------------------------------------------------------- | ------------------ |
| **`mode`**     | <code><a href="#outputmode">OutputMode.Keystroke</a></code> | Virtual Keyboard output                                           |                    |
| **`interval`** | <code>number</code>                                         | Time to sleep between keystrokes                                  | <code>0</code>     |
| **`tab`**      | <code>boolean</code>                                        | Send a tab keystroke after the barcode                            | <code>false</code> |
| **`enter`**    | <code>boolean</code>                                        | Send an enter keystroke after the barcode                         | <code>true</code>  |
| **`space`**    | <code>boolean</code>                                        | Send a space keystroke after the barcode Hardware support limited | <code>false</code> |


#### SetOutputTypeDirectFillOptions

| Prop          | Type                                                                                                                       | Description                                                       | Default            |
| ------------- | -------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------- | ------------------ |
| **`mode`**    | <code><a href="#outputmode">OutputMode.DirectFill</a> \| <a href="#outputmode">OutputMode.DirectFillWithReplace</a></code> | Fill in EditText directly                                         |                    |
| **`tab`**     | <code>boolean</code>                                                                                                       | Send a tab keystroke after the barcode                            | <code>false</code> |
| **`enter`**   | <code>boolean</code>                                                                                                       | Send an enter keystroke after the barcode                         | <code>true</code>  |
| **`space`**   | <code>boolean</code>                                                                                                       | Send a space keystroke after the barcode Hardware support limited | <code>false</code> |
| **`asEvent`** | <code>boolean</code>                                                                                                       | Convert characters into keys                                      | <code>false</code> |


#### GetTriggerMethodTriggerPulseResponse

| Prop          | Type                                                                                            | Description                                                                  |
| ------------- | ----------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------- |
| **`mode`**    | <code><a href="#scanmode">ScanMode.Trigger</a> \| <a href="#scanmode">ScanMode.Pulse</a></code> |                                                                              |
| **`timeout`** | <code>number</code>                                                                             | Timeout after which the scanner will stop scanning if no barcode is detected |


#### GetTriggerMethodContinuousLongPressResponse

| Prop          | Type                                                                                                   | Description                                                                  |
| ------------- | ------------------------------------------------------------------------------------------------------ | ---------------------------------------------------------------------------- |
| **`mode`**    | <code><a href="#scanmode">ScanMode.Continuous</a> \| <a href="#scanmode">ScanMode.LongPress</a></code> |                                                                              |
| **`timeout`** | <code>number</code>                                                                                    | Timeout after which the scanner will stop scanning if no barcode is detected |
| **`sleep`**   | <code>number</code>                                                                                    | Time to sleep between scans                                                  |


#### SetTriggerMethodTriggerPulseOptions

| Prop          | Type                                                                                            | Description                                                                  | Default           |
| ------------- | ----------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ----------------- |
| **`mode`**    | <code><a href="#scanmode">ScanMode.Trigger</a> \| <a href="#scanmode">ScanMode.Pulse</a></code> |                                                                              |                   |
| **`timeout`** | <code>number</code>                                                                             | Timeout after which the scanner will stop scanning if no barcode is detected | <code>5000</code> |


#### SetTriggerMethodContinuousLongPressOptions

| Prop          | Type                                                                                                   | Description                                                                  | Default           |
| ------------- | ------------------------------------------------------------------------------------------------------ | ---------------------------------------------------------------------------- | ----------------- |
| **`mode`**    | <code><a href="#scanmode">ScanMode.Continuous</a> \| <a href="#scanmode">ScanMode.LongPress</a></code> |                                                                              |                   |
| **`timeout`** | <code>number</code>                                                                                    | Timeout after which the scanner will stop scanning if no barcode is detected | <code>5000</code> |
| **`sleep`**   | <code>number</code>                                                                                    | Time to sleep between scans                                                  | <code>500</code>  |


#### GetScanResultCodeIDResponse

| Prop       | Type                                                                  | Description                                            |
| ---------- | --------------------------------------------------------------------- | ------------------------------------------------------ |
| **`type`** | <code><a href="#scanresultcodeidenum">ScanResultCodeIDEnum</a></code> | Selects variant of code type returned with scan result |


#### SetScanResultCodeIDOptions

| Prop       | Type                                                                  | Description                                            | Default                                |
| ---------- | --------------------------------------------------------------------- | ------------------------------------------------------ | -------------------------------------- |
| **`type`** | <code><a href="#scanresultcodeidenum">ScanResultCodeIDEnum</a></code> | Selects variant of code type returned with scan result | <code>ScanResultCodeIDEnum.None</code> |


#### IsAdvancedFormatEnabledResponse

| Prop          | Type                 | Description                                                             |
| ------------- | -------------------- | ----------------------------------------------------------------------- |
| **`enabled`** | <code>boolean</code> | Enable or disable advanced formatting options provided in configuration |


#### SetAdvancedFormatEnabledOptions

| Prop          | Type                 | Description                                                             | Default           |
| ------------- | -------------------- | ----------------------------------------------------------------------- | ----------------- |
| **`enabled`** | <code>boolean</code> | Enable or disable advanced formatting options provided in configuration | <code>true</code> |


#### GetAdvancedFormatEnabledResponse

| Prop          | Type                                                      | Description                                                  |
| ------------- | --------------------------------------------------------- | ------------------------------------------------------------ |
| **`formats`** | <code><a href="#map">Map</a>&lt;string, string&gt;</code> | List of advanced formatting options - characters replacement |


#### Map

| Prop       | Type                |
| ---------- | ------------------- |
| **`size`** | <code>number</code> |

| Method      | Signature                                                                                                      |
| ----------- | -------------------------------------------------------------------------------------------------------------- |
| **clear**   | () =&gt; void                                                                                                  |
| **delete**  | (key: K) =&gt; boolean                                                                                         |
| **forEach** | (callbackfn: (value: V, key: K, map: <a href="#map">Map</a>&lt;K, V&gt;) =&gt; void, thisArg?: any) =&gt; void |
| **get**     | (key: K) =&gt; V \| undefined                                                                                  |
| **has**     | (key: K) =&gt; boolean                                                                                         |
| **set**     | (key: K, value: V) =&gt; this                                                                                  |


#### SetAdvancedFormatOptions

| Prop          | Type                                                      | Description                                                  | Default         |
| ------------- | --------------------------------------------------------- | ------------------------------------------------------------ | --------------- |
| **`formats`** | <code><a href="#map">Map</a>&lt;string, string&gt;</code> | List of advanced formatting options - characters replacement | <code>[]</code> |


#### AddAdvancedFormatOptions

| Prop              | Type                | Description           |
| ----------------- | ------------------- | --------------------- |
| **`search`**      | <code>string</code> | Value to search for   |
| **`replacement`** | <code>string</code> | Value to replace with |


#### UpdateAdvancedFormatOptions

| Prop              | Type                | Description           |
| ----------------- | ------------------- | --------------------- |
| **`old_search`**  | <code>string</code> | Previous search value |
| **`search`**      | <code>string</code> | New search value      |
| **`replacement`** | <code>string</code> | Value to replace with |


#### RemoveAdvancedFormatOptions

| Prop         | Type                | Description         |
| ------------ | ------------------- | ------------------- |
| **`search`** | <code>string</code> | Value to search for |


#### IsBeepResponse

| Prop          | Type                 | Description                             |
| ------------- | -------------------- | --------------------------------------- |
| **`enabled`** | <code>boolean</code> | Enable or disable sound prompts on scan |


#### SetBeepOptions

| Prop          | Type                 | Description                             | Default           |
| ------------- | -------------------- | --------------------------------------- | ----------------- |
| **`enabled`** | <code>boolean</code> | Enable or disable sound prompts on scan | <code>true</code> |


#### IsVibrateResponse

| Prop          | Type                 | Description                                 |
| ------------- | -------------------- | ------------------------------------------- |
| **`enabled`** | <code>boolean</code> | Enable or disable vibration prompts on scan |


#### SetVibrateOptions

| Prop          | Type                 | Description                                 | Default           |
| ------------- | -------------------- | ------------------------------------------- | ----------------- |
| **`enabled`** | <code>boolean</code> | Enable or disable vibration prompts on scan | <code>true</code> |


#### IsOutputBroadcastEnableResponse

| Prop          | Type                 | Description                             |
| ------------- | -------------------- | --------------------------------------- |
| **`enabled`** | <code>boolean</code> | Enable or disable scan result broadcast |


#### SetOutputBroadcastEnabledOutput

| Prop          | Type                 | Description                             | Default           |
| ------------- | -------------------- | --------------------------------------- | ----------------- |
| **`enabled`** | <code>boolean</code> | Enable or disable scan result broadcast | <code>true</code> |


#### GetBroadcastConfigurationResponse

| Prop                  | Type                         | Description                                                                               |
| --------------------- | ---------------------------- | ----------------------------------------------------------------------------------------- |
| **`scanned_intent`**  | <code>string</code>          | Intent name broadcasted when a barcode is scanned                                         |
| **`start_intent`**    | <code>string \| false</code> | Intent name broadcasted when scanner starts scanning Set to `false` to disable            |
| **`end_intent`**      | <code>string \| false</code> | Intent name broadcasted when scanner stops scanning Set to `false` to disable             |
| **`intent_data_key`** | <code>string</code>          | Intent extra key for barcode plain text data in scan result intent (`scanned_intent`)     |
| **`intent_byte_key`** | <code>string</code>          | Intent extra key for barcode base64 encoded data in scan result intent (`scanned_intent`) |


#### SetBroadcastConfigurationOptions

| Prop                  | Type                         | Description                                                                               | Default                                                  |
| --------------------- | ---------------------------- | ----------------------------------------------------------------------------------------- | -------------------------------------------------------- |
| **`scanned_intent`**  | <code>string</code>          | Intent name broadcasted when a barcode is scanned                                         | <code>com.sunmi.scanner.ACTION_DATA_CODE_RECEIVED</code> |
| **`start_intent`**    | <code>string \| false</code> | Intent name broadcasted when scanner starts scanning Set to `false` to disable            | <code>com.sunmi.scanner.ACTION_SCAN_START</code>         |
| **`end_intent`**      | <code>string \| false</code> | Intent name broadcasted when scanner stops scanning Set to `false` to disable             | <code>com.sunmi.scanner.ACTION_SCAN_END</code>           |
| **`intent_data_key`** | <code>string</code>          | Intent extra key for barcode plain text data in scan result intent (`scanned_intent`)     | <code>data</code>                                        |
| **`intent_byte_key`** | <code>string</code>          | Intent extra key for barcode base64 encoded data in scan result intent (`scanned_intent`) | <code>source_byte</code>                                 |


#### GetOutputEncodingCodeResponse

| Prop           | Type                                                                      | Description                               |
| -------------- | ------------------------------------------------------------------------- | ----------------------------------------- |
| **`encoding`** | <code><a href="#outputencodingcodeenum">OutputEncodingCodeEnum</a></code> | Set output encoding/character set setting |


#### SetOutputEncodingCodeOptions

| Prop           | Type                                                                      | Description                               | Default                                  |
| -------------- | ------------------------------------------------------------------------- | ----------------------------------------- | ---------------------------------------- |
| **`encoding`** | <code><a href="#outputencodingcodeenum">OutputEncodingCodeEnum</a></code> | Set output encoding/character set setting | <code>OutputEncodingCodeEnum.UTF8</code> |


#### IsVirtualFloatingScanButtonResponse

| Prop          | Type                 | Description                                    |
| ------------- | -------------------- | ---------------------------------------------- |
| **`enabled`** | <code>boolean</code> | Enable or disable virtual floating scan button |


#### SetVirtualFloatingScanButtonOptions

| Prop          | Type                 | Description                                    | Default           |
| ------------- | -------------------- | ---------------------------------------------- | ----------------- |
| **`enabled`** | <code>boolean</code> | Enable or disable virtual floating scan button | <code>true</code> |


#### GetCenterFlagScanResponse

| Prop       | Type                                                                            | Description                        |
| ---------- | ------------------------------------------------------------------------------- | ---------------------------------- |
| **`mode`** | <code><a href="#centerdecodingsettingenum">CenterDecodingSettingEnum</a></code> | Selects center point decoding mode |


#### SetCenterFlagScanOptions

| Prop       | Type                                                                            | Description                        | Default                                         |
| ---------- | ------------------------------------------------------------------------------- | ---------------------------------- | ----------------------------------------------- |
| **`mode`** | <code><a href="#centerdecodingsettingenum">CenterDecodingSettingEnum</a></code> | Selects center point decoding mode | <code>CenterDecodingSettingEnum.Disabled</code> |


#### IsFlashResponse

| Prop          | Type                 | Description                            |
| ------------- | -------------------- | -------------------------------------- |
| **`enabled`** | <code>boolean</code> | Enable or disable scanner illumination |


#### SetFlashOptions

| Prop          | Type                 | Description                            | Default           |
| ------------- | -------------------- | -------------------------------------- | ----------------- |
| **`enabled`** | <code>boolean</code> | Enable or disable scanner illumination | <code>true</code> |


#### GetSceneResponse

| Prop        | Type                                                            | Description                   |
| ----------- | --------------------------------------------------------------- | ----------------------------- |
| **`scene`** | <code><a href="#specificsceneenum">SpecificSceneEnum</a></code> | Selects scanning scene preset |


#### SetSceneOptions

| Prop        | Type                                                            | Description                   | Default                                |
| ----------- | --------------------------------------------------------------- | ----------------------------- | -------------------------------------- |
| **`scene`** | <code><a href="#specificsceneenum">SpecificSceneEnum</a></code> | Selects scanning scene preset | <code>SpecificSceneEnum.Default</code> |


#### IsRemoveGroupSeparatorResponse

| Prop          | Type                 | Description                                                 |
| ------------- | -------------------- | ----------------------------------------------------------- |
| **`enabled`** | <code>boolean</code> | Enable or disable the removal of group separator characters |


#### SetRemoveGroupSeparatorOptions

| Prop          | Type                 | Description                                                 | Default           |
| ------------- | -------------------- | ----------------------------------------------------------- | ----------------- |
| **`enabled`** | <code>boolean</code> | Enable or disable the removal of group separator characters | <code>true</code> |


#### GetPrefixResponse

| Prop          | Type                         | Description                                                                                         |
| ------------- | ---------------------------- | --------------------------------------------------------------------------------------------------- |
| **`content`** | <code>string \| false</code> | Prefix content to be prepended to the barcode data When set to `false`, the prefix will be disabled |


#### SetPrefixOptions

| Prop          | Type                         | Description                                                                                         | Default            |
| ------------- | ---------------------------- | --------------------------------------------------------------------------------------------------- | ------------------ |
| **`content`** | <code>string \| false</code> | Prefix content to be prepended to the barcode data When set to `false`, the prefix will be disabled | <code>false</code> |


#### GetPrefixCharactersRemovedResponse

| Prop         | Type                | Description                                                               |
| ------------ | ------------------- | ------------------------------------------------------------------------- |
| **`length`** | <code>number</code> | Number of characters to be removed from the beginning of the barcode data |


#### SetPrefixCharactersRemovedOptions

| Prop         | Type                | Description                                                               | Default        |
| ------------ | ------------------- | ------------------------------------------------------------------------- | -------------- |
| **`length`** | <code>number</code> | Number of characters to be removed from the beginning of the barcode data | <code>0</code> |


#### GetSuffixResponse

| Prop          | Type                         | Description                                                                                        |
| ------------- | ---------------------------- | -------------------------------------------------------------------------------------------------- |
| **`content`** | <code>string \| false</code> | Suffix content to be appended to the barcode data When set to `false`, the suffix will be disabled |


#### SetSuffixOptions

| Prop          | Type                         | Description                                                                                        | Default            |
| ------------- | ---------------------------- | -------------------------------------------------------------------------------------------------- | ------------------ |
| **`content`** | <code>string \| false</code> | Suffix content to be appended to the barcode data When set to `false`, the suffix will be disabled | <code>false</code> |


#### GetSuffixCharactersRemovedResponse

| Prop         | Type                | Description                                                         |
| ------------ | ------------------- | ------------------------------------------------------------------- |
| **`length`** | <code>number</code> | Number of characters to be removed from the end of the barcode data |


#### SetSuffixCharactersRemovedOptions

| Prop         | Type                | Description                                                         | Default        |
| ------------ | ------------------- | ------------------------------------------------------------------- | -------------- |
| **`length`** | <code>number</code> | Number of characters to be removed from the end of the barcode data | <code>0</code> |


#### GetBarcodesListResponse

| Prop       | Type                                                       | Description                                                                                                                 |
| ---------- | ---------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- |
| **`list`** | <code><a href="#map">Map</a>&lt;string, boolean&gt;</code> | List of barcodes, and its statuses. Key is barcode symbology name, value is status: `true` if enabled, `false` if disabled. |


#### GetBarcodeResponse

| Prop          | Type                 | Description    |
| ------------- | -------------------- | -------------- |
| **`enabled`** | <code>boolean</code> | Barcode status |


#### GetBarcodeOptions

| Prop       | Type                | Description            |
| ---------- | ------------------- | ---------------------- |
| **`name`** | <code>string</code> | Barcode symbology name |


#### SetBarcodeOptions

| Prop          | Type                 | Description            |
| ------------- | -------------------- | ---------------------- |
| **`name`**    | <code>string</code>  | Barcode symbology name |
| **`enabled`** | <code>boolean</code> | Barcode status         |


#### GetBarcodeConfigResponse

| Prop                   | Type                 |
| ---------------------- | -------------------- |
| **`checkCharMode`**    | <code>number</code>  |
| **`checkCharType`**    | <code>number</code>  |
| **`doubleCode`**       | <code>number</code>  |
| **`formatCode`**       | <code>number</code>  |
| **`inverseCode`**      | <code>number</code>  |
| **`isExtendCode1`**    | <code>boolean</code> |
| **`isExtendCode2`**    | <code>boolean</code> |
| **`isExtendToCode`**   | <code>boolean</code> |
| **`isMicroCode`**      | <code>boolean</code> |
| **`isStartEndType`**   | <code>boolean</code> |
| **`isSystemCharZero`** | <code>boolean</code> |
| **`maxLen`**           | <code>number</code>  |
| **`minLen`**           | <code>number</code>  |


#### GetBarcodeConfigOptions

| Prop       | Type                | Description            |
| ---------- | ------------------- | ---------------------- |
| **`name`** | <code>string</code> | Barcode symbology name |


#### GetCheckCharModeResponse

| Prop        | Type                |
| ----------- | ------------------- |
| **`value`** | <code>number</code> |


#### GetCheckCharModeOptions

| Prop       | Type                | Description            |
| ---------- | ------------------- | ---------------------- |
| **`name`** | <code>string</code> | Barcode symbology name |


#### SetCheckCharModeOptions

| Prop        | Type                | Description            |
| ----------- | ------------------- | ---------------------- |
| **`name`**  | <code>string</code> | Barcode symbology name |
| **`value`** | <code>number</code> |                        |


#### GetCheckCharTypeResponse

| Prop        | Type                |
| ----------- | ------------------- |
| **`value`** | <code>number</code> |


#### GetCheckCharTypeOptions

| Prop       | Type                | Description            |
| ---------- | ------------------- | ---------------------- |
| **`name`** | <code>string</code> | Barcode symbology name |


#### SetCheckCharTypeOptions

| Prop        | Type                | Description            |
| ----------- | ------------------- | ---------------------- |
| **`name`**  | <code>string</code> | Barcode symbology name |
| **`value`** | <code>number</code> |                        |


#### GetDoubleCodeResponse

| Prop        | Type                |
| ----------- | ------------------- |
| **`value`** | <code>number</code> |


#### GetDoubleCodeOptions

| Prop       | Type                | Description            |
| ---------- | ------------------- | ---------------------- |
| **`name`** | <code>string</code> | Barcode symbology name |


#### SetDoubleCodeOptions

| Prop        | Type                | Description            |
| ----------- | ------------------- | ---------------------- |
| **`name`**  | <code>string</code> | Barcode symbology name |
| **`value`** | <code>number</code> |                        |


#### GetFormatCodeResponse

| Prop        | Type                |
| ----------- | ------------------- |
| **`value`** | <code>number</code> |


#### GetFormatCodeOptions

| Prop       | Type                | Description            |
| ---------- | ------------------- | ---------------------- |
| **`name`** | <code>string</code> | Barcode symbology name |


#### SetFormatCodeOptions

| Prop        | Type                | Description            |
| ----------- | ------------------- | ---------------------- |
| **`name`**  | <code>string</code> | Barcode symbology name |
| **`value`** | <code>number</code> |                        |


#### GetInverseCodeResponse

| Prop        | Type                |
| ----------- | ------------------- |
| **`value`** | <code>number</code> |


#### GetInverseCodeOptions

| Prop       | Type                | Description            |
| ---------- | ------------------- | ---------------------- |
| **`name`** | <code>string</code> | Barcode symbology name |


#### SetInverseCodeOptions

| Prop        | Type                | Description            |
| ----------- | ------------------- | ---------------------- |
| **`name`**  | <code>string</code> | Barcode symbology name |
| **`value`** | <code>number</code> |                        |


#### IsExtendCode1Response

| Prop        | Type                 |
| ----------- | -------------------- |
| **`value`** | <code>boolean</code> |


#### IsExtendCode1Options

| Prop       | Type                | Description            |
| ---------- | ------------------- | ---------------------- |
| **`name`** | <code>string</code> | Barcode symbology name |


#### SetExtendCode1Options

| Prop        | Type                 | Description            |
| ----------- | -------------------- | ---------------------- |
| **`name`**  | <code>string</code>  | Barcode symbology name |
| **`value`** | <code>boolean</code> |                        |


#### IsExtendCode2Response

| Prop        | Type                 |
| ----------- | -------------------- |
| **`value`** | <code>boolean</code> |


#### IsExtendCode2Options

| Prop       | Type                | Description            |
| ---------- | ------------------- | ---------------------- |
| **`name`** | <code>string</code> | Barcode symbology name |


#### SetExtendCode2Options

| Prop        | Type                 | Description            |
| ----------- | -------------------- | ---------------------- |
| **`name`**  | <code>string</code>  | Barcode symbology name |
| **`value`** | <code>boolean</code> |                        |


#### IsExtendToCodeResponse

| Prop        | Type                 |
| ----------- | -------------------- |
| **`value`** | <code>boolean</code> |


#### IsExtendToCodeOptions

| Prop       | Type                | Description            |
| ---------- | ------------------- | ---------------------- |
| **`name`** | <code>string</code> | Barcode symbology name |


#### SetExtendToCodeOptions

| Prop        | Type                 | Description            |
| ----------- | -------------------- | ---------------------- |
| **`name`**  | <code>string</code>  | Barcode symbology name |
| **`value`** | <code>boolean</code> |                        |


#### IsMicroCodeResponse

| Prop        | Type                 |
| ----------- | -------------------- |
| **`value`** | <code>boolean</code> |


#### IsMicroCodeOptions

| Prop       | Type                | Description            |
| ---------- | ------------------- | ---------------------- |
| **`name`** | <code>string</code> | Barcode symbology name |


#### SetMicroCodeOptions

| Prop        | Type                 | Description            |
| ----------- | -------------------- | ---------------------- |
| **`name`**  | <code>string</code>  | Barcode symbology name |
| **`value`** | <code>boolean</code> |                        |


#### IsStartEndTypeResponse

| Prop        | Type                 |
| ----------- | -------------------- |
| **`value`** | <code>boolean</code> |


#### IsStartEndTypeOptions

| Prop       | Type                | Description            |
| ---------- | ------------------- | ---------------------- |
| **`name`** | <code>string</code> | Barcode symbology name |


#### SetStartEndTypeOptions

| Prop        | Type                 | Description            |
| ----------- | -------------------- | ---------------------- |
| **`name`**  | <code>string</code>  | Barcode symbology name |
| **`value`** | <code>boolean</code> |                        |


#### IsSystemCharZeroResponse

| Prop        | Type                 |
| ----------- | -------------------- |
| **`value`** | <code>boolean</code> |


#### IsSystemCharZeroOptions

| Prop       | Type                | Description            |
| ---------- | ------------------- | ---------------------- |
| **`name`** | <code>string</code> | Barcode symbology name |


#### SetSystemCharZeroOptions

| Prop        | Type                 | Description            |
| ----------- | -------------------- | ---------------------- |
| **`name`**  | <code>string</code>  | Barcode symbology name |
| **`value`** | <code>boolean</code> |                        |


#### GetMaxLenResponse

| Prop        | Type                |
| ----------- | ------------------- |
| **`value`** | <code>number</code> |


#### GetMaxLenOptions

| Prop       | Type                | Description            |
| ---------- | ------------------- | ---------------------- |
| **`name`** | <code>string</code> | Barcode symbology name |


#### SetMaxLenOptions

| Prop        | Type                | Description            |
| ----------- | ------------------- | ---------------------- |
| **`name`**  | <code>string</code> | Barcode symbology name |
| **`value`** | <code>number</code> |                        |


#### GetMinLenResponse

| Prop        | Type                |
| ----------- | ------------------- |
| **`value`** | <code>number</code> |


#### GetMinLenOptions

| Prop       | Type                | Description            |
| ---------- | ------------------- | ---------------------- |
| **`name`** | <code>string</code> | Barcode symbology name |


#### SetMinLenOptions

| Prop        | Type                | Description            |
| ----------- | ------------------- | ---------------------- |
| **`name`**  | <code>string</code> | Barcode symbology name |
| **`value`** | <code>number</code> |                        |


#### GetStartEndFormatResponse

| Prop        | Type                |
| ----------- | ------------------- |
| **`value`** | <code>number</code> |


#### GetStartEndFormatOptions

| Prop       | Type                | Description            |
| ---------- | ------------------- | ---------------------- |
| **`name`** | <code>string</code> | Barcode symbology name |


#### SetStartEndFormatOptions

| Prop        | Type                | Description            |
| ----------- | ------------------- | ---------------------- |
| **`name`**  | <code>string</code> | Barcode symbology name |
| **`value`** | <code>number</code> |                        |


#### PluginListenerHandle

| Prop         | Type                                      |
| ------------ | ----------------------------------------- |
| **`remove`** | <code>() =&gt; Promise&lt;void&gt;</code> |


### Type Aliases


#### ScannerModelName

<code><a href="#scannermodel">ScannerModel</a> | string</code>


#### GetOutputTypeResponse

<code><a href="#getoutputtypedisabledresponse">GetOutputTypeDisabledResponse</a> | <a href="#getoutputtypekeystrokeresponse">GetOutputTypeKeystrokeResponse</a> | <a href="#getoutputtypedirectfillresponse">GetOutputTypeDirectFillResponse</a></code>


#### SetOutputTypeOptions

<code><a href="#setoutputtypedisabledoptions">SetOutputTypeDisabledOptions</a> | <a href="#setoutputtypekeystrokeoptions">SetOutputTypeKeystrokeOptions</a> | <a href="#setoutputtypedirectfilloptions">SetOutputTypeDirectFillOptions</a></code>


#### GetTriggerMethodResponse

<code><a href="#gettriggermethodtriggerpulseresponse">GetTriggerMethodTriggerPulseResponse</a> | <a href="#gettriggermethodcontinuouslongpressresponse">GetTriggerMethodContinuousLongPressResponse</a></code>


#### SetTriggerMethodOptions

<code><a href="#settriggermethodtriggerpulseoptions">SetTriggerMethodTriggerPulseOptions</a> | <a href="#settriggermethodcontinuouslongpressoptions">SetTriggerMethodContinuousLongPressOptions</a></code>


#### OnScanResultListener

Callback to receive scan results broadcasted by the scanner

<code>(scan: { data: string; source_bytes: string; }): void</code>


#### OnScanStartListener

Callback to receive scan start event broadcasted by the scanner

<code>(): void</code>


#### OnScanStopListener

Callback to receive scan stop event broadcasted by the scanner

<code>(): void</code>


### Enums


#### ScannerModel

| Members                 | Value                            |
| ----------------------- | -------------------------------- |
| **`NONE`**              | <code>"NONE"</code>              |
| **`SUPER_N1365_Y1825`** | <code>"SUPER_N1365_Y1825"</code> |
| **`NLS_2096`**          | <code>"NLS_2096"</code>          |
| **`ZEBRA_4710`**        | <code>"ZEBRA_4710"</code>        |
| **`HONEYWELL_3601`**    | <code>"HONEYWELL_3601"</code>    |
| **`HONEYWELL_6603`**    | <code>"HONEYWELL_6603"</code>    |
| **`ZEBRA_4750`**        | <code>"ZEBRA_4750"</code>        |
| **`ZEBRA_1350`**        | <code>"ZEBRA_1350"</code>        |
| **`HONEYWELL_6703`**    | <code>"HONEYWELL_6703"</code>    |
| **`HONEYWELL_3603`**    | <code>"HONEYWELL_3603"</code>    |
| **`NLS_CM47`**          | <code>"NLS_CM47"</code>          |
| **`NLS_3108`**          | <code>"NLS_3108"</code>          |
| **`ZEBRA_965`**         | <code>"ZEBRA_965"</code>         |
| **`SM_SS_1100`**        | <code>"SM_SS_1100"</code>        |
| **`NLS_CM30`**          | <code>"NLS_CM30"</code>          |
| **`HONEYWELL_4603`**    | <code>"HONEYWELL_4603"</code>    |
| **`ZEBRA_4770`**        | <code>"ZEBRA_4770"</code>        |
| **`NLS_2596`**          | <code>"NLS_2596"</code>          |
| **`SM_SS_1103`**        | <code>"SM_SS_1103"</code>        |
| **`SM_SS_1101`**        | <code>"SM_SS_1101"</code>        |
| **`HONEYWELL_5703`**    | <code>"HONEYWELL_5703"</code>    |
| **`UNKNOWN`**           | <code>"UNKNOWN"</code>           |


#### WriteContextType

| Members        | Value                   | Description                                                                                                 |
| -------------- | ----------------------- | ----------------------------------------------------------------------------------------------------------- |
| **`Service`**  | <code>"service"</code>  | Service write context type, permits reading and writing of scanner related settings                         |
| **`Decoders`** | <code>"decoders"</code> | Decoder write context type, permits enabling or disabling of barcode symbologies, and changing its settings |


#### OutputMode

| Members                     | Value                                   | Description                             |
| --------------------------- | --------------------------------------- | --------------------------------------- |
| **`DirectFill`**            | <code>"direct-fill"</code>              | Fill in EditText directly               |
| **`DirectFillWithReplace`** | <code>"direct-fill-with-replace"</code> | Fill and overwrite in EditText directly |
| **`Keystroke`**             | <code>"keystroke"</code>                | Virtual Keyboard output                 |
| **`Disabled`**              | <code>"disabled"</code>                 | No direct output                        |


#### ScanMode

| Members          | Value                     | Description                                                                                |
| ---------------- | ------------------------- | ------------------------------------------------------------------------------------------ |
| **`Trigger`**    | <code>"trigger"</code>    | Trigger Mode: Short press to scan, and release to stop scanning                            |
| **`Continuous`** | <code>"continuous"</code> | Continuous Mode: Short press to start scanning, and short press to stop scanning           |
| **`Pulse`**      | <code>"pulse"</code>      | Pulse Mode: Short press to start scanning until timeout                                    |
| **`LongPress`**  | <code>"long-press"</code> | Long Press Mode: Long press to scan continuously, release to stop Hardware support limited |


#### ScanResultCodeIDEnum

| Members        | Value                    | Description              |
| -------------- | ------------------------ | ------------------------ |
| **`None`**     | <code>"none"</code>      |                          |
| **`SunmiId`**  | <code>"sunmi-id"</code>  |                          |
| **`AimId`**    | <code>"aim-id"</code>    | Hardware support limited |
| **`SymbolId`** | <code>"symbol-id"</code> | Hardware support limited |


#### OutputEncodingCodeEnum

| Members           | Value                      | Description                             |
| ----------------- | -------------------------- | --------------------------------------- |
| **`UTF8`**        | <code>"UTF8"</code>        |                                         |
| **`GBK`**         | <code>"GBK"</code>         |                                         |
| **`ISO88591`**    | <code>"ISO88591"</code>    |                                         |
| **`SHIFTJIS`**    | <code>"SHIFTJIS"</code>    |                                         |
| **`Auto`**        | <code>"Auto"</code>        | Auto detect encoding/compatibility mode |
| **`WINDOWS1256`** | <code>"WINDOWS1256"</code> |                                         |
| **`WINDOWS874`**  | <code>"WINDOWS874"</code>  | Hardware support limited                |
| **`Unicode`**     | <code>"Unicode"</code>     | Hardware support limited                |
| **`Big5`**        | <code>"Big5"</code>        | Hardware support limited                |
| **`ASCII`**       | <code>"ASCII"</code>       | Hardware support limited                |
| **`GB2312`**      | <code>"GB2312"</code>      | Hardware support limited                |
| **`GB18030`**     | <code>"GB18030"</code>     | Hardware support limited                |


#### CenterDecodingSettingEnum

| Members           | Value                       | Description              |
| ----------------- | --------------------------- | ------------------------ |
| **`Disabled`**    | <code>"disabled"</code>     |                          |
| **`CenterOnly`**  | <code>"center-only"</code>  |                          |
| **`CenterFirst`** | <code>"center-first"</code> | Hardware support limited |


#### SpecificSceneEnum

| Members                     | Value                                   |
| --------------------------- | --------------------------------------- |
| **`Default`**               | <code>"default"</code>                  |
| **`ReflectiveDMBarcode`**   | <code>"reflective-dm-barcode"</code>    |
| **`ReflectiveQRDMBarcode`** | <code>"reflective-qr-dm-barcode"</code> |
| **`SpecialColourBarcode`**  | <code>"special-colour-barcode"</code>   |
| **`DpmBarcode`**            | <code>"dpm-barcode"</code>              |
| **`MobileScreenScene`**     | <code>"mobile-screen-scene"</code>      |

</docgen-api>
