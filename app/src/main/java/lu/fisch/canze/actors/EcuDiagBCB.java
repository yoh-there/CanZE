/*
    CanZE
    Take a closer look at your ZE car

    Copyright (C) 2015 - The CanZE Team
    http://canze.fisch.lu

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or any
    later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package lu.fisch.canze.actors;

/**
 * Created by jeroen on 4-12-16.
 */

public class EcuDiagBCB {

    // static final public String fieldsString () {
    void load () {

        String fieldDefJb2 = // ID (hex), startBit, endBit, resolution, offset (aplied BEFORE resolution multiplication), decimals, unit, requestID (hex string), responseID (hex string),
                // options (hex, see MainActivity for definitions), optional name, optional list
                ""

                        +"793,29,31,1,0,0,,222003,622003,ff,Junction box 2 state,0:Init;1:Charge;4:Wait;5:Power Off/Sleep\n" //
                        +"793,24,31,1,40,0,°C,222005,622005,ff,Cooling temperature from BI\n" //
                        +"793,24,47,1,0,0,,225001,625001,ff,Plugging counter\n" //
                        +"793,24,47,1,0,0,,225002,625002,ff,Wake Up counter\n" //
                        +"793,31,31,1,0,0,,225003,625003,ff,Raw A/C plug interlock value,0:open;1:closed\n" //
                        +"793,31,31,1,0,0,,225005,625005,ff,CAN activity for JB2,0:No activity;1:Activity\n" //
                        +"793,31,31,1,0,0,,225008,625008,ff,Raw JB2 hood plug interlock value,0:open;1:closed\n" //
                        +"793,31,31,1,0,0,,225009,625009,ff,Raw HV Battery plug interlock value,0:open;1:closed\n" //
                        +"793,31,31,1,0,0,,22500B,62500B,ff,Raw mains interlock value,0:open;1:closed\n" //
                        +"793,31,31,1,0,0,,22500C,62500C,ff,Mains tri phases permutation,0:v1/v2/v3 off;1:v1/v2/v3 on\n" //
                        +"793,31,31,1,0,0,,22500D,62500D,ff,Mains voltage presence,0:Absent;1:Present\n" //
                        +"793,31,31,1,0,0,,22500E,62500E,ff,Wake-Up request from Mains or plug presence,0:No wake-up request;1:Wake-up request\n" //
                        +"793,31,31,1,0,0,,22500F,62500F,ff,Raw PEB plug interlock value,0:open;1:closed\n" //
                        +"793,31,31,1,0,0,,225010,625010,ff,Raw PEB neutral interlock value,0:open;1:closed\n" //
                        +"793,31,31,1,0,0,,225011,625011,ff,Raw PTC plug interlock value,0:open;1:closed\n" //
                        +"793,30,31,1,0,0,,225015,625015,ff,Wake-Up / Sleep request from EVC,0:Wake-up;1:Sleep;2:UV\n" //
                        +"793,29,31,1,0,0,,225016,625016,ff,Junction box 2 state request from EVC,0:init;1:Charge;4:Wait;5:Power Off/Sleep\n" //
                        +"793,29,31,1,0,0,,225017,625017,ff,Mains current type,0:Nok;1:AC mono;2:AC tri;3:DC;4:AC bi\n" //
                        +"793,30,31,1,0,0,,225018,625018,ff,Mains plug unlocking CAN request,0:Unavailable;1:Unlock request;2:No unlock request\n" //
                        +"793,30,31,1,0,0,,225019,625019,ff,Memorized value of the wake up activation,0:Wake-up activated;1:Wake-up deactivated\n" //
                        +"793,31,31,1,0,0,,22501A,62501A,ff,BCM wake-up by wire,0:No wake-up;1:Wake-up\n" //
                        +"793,31,31,1,0,0,,22501C,62501C,ff,S2 relay control,0:Open;1:Close\n" //
                        +"793,30,31,1,0,0,,22501D,62501D,ff,Charge state request,0:No charge;1:Charge;2:Emergency stop\n" //
                        +"793,29,31,1,0,0,,22501E,62501E,ff,Global system state,0:Init;1:Actif;2:Sleep\n" //
                        +"793,30,31,1,0,0,,22501F,62501F,ff,System Temperature State,0:Ok;1:Derating;2:Nok\n" //
                        +"793,30,31,1,0,0,,225021,625021,ff,Cooling Temperature State,0:Ok;1:Derating;2:Nok\n" //
                        +"793,30,31,1,0,0,,225022,625022,ff,Auto wake-up enabling,0:No change;1:Activation;2:Deactivation\n" //
                        +"793,24,39,.0625,880,0,°C,225023,625023,ff,Raw CPU temperature value from BI\n" //
                        +"793,24,39,.0625,3200,0,A,225024,625024,ff,Measured neutral current filtred\n" //
                        +"793,24,39,.0625,3200,0,A,225025,625025,ff,Neutral current value from BI\n" //
                        +"793,24,31,1,0,0,%,225026,625026,ff,J1772 control pilot raw duty cycle\n" //
                        +"793,24,31,.25,60,0,V,225027,625027,ff,J1772 control pilot raw voltage\n" //
                        +"793,24,31,1,40,0,°C,225028,625028,ff,Mains input filter temperature from SPI\n" //
                        +"793,24,39,.0625,3200,0,A,225029,625029,ff,Raw AC mains phase 1 measured current\n" //
                        +"793,24,39,.0625,3200,0,A,22502A,62502A,ff,Raw AC mains phase 2 measured current\n" //
                        +"793,24,39,.0625,3200,0,A,22502B,62502B,ff,Raw AC mains phase 3 measured current\n" //
                        +"793,24,39,.5,32000,0,V,22502C,62502C,ff,Raw AC mains phase 1 measured voltage\n" //
                        +"793,24,39,.5,32000,0,V,22502D,62502D,ff,Raw AC mains phase 2 measured voltage\n" //
                        +"793,24,39,.5,32000,0,V,22502E,62502E,ff,Raw AC mains phase 3 measured voltage\n" //
                        +"793,48,48,1,0,0,,1902AF,5902AF,ff,DTCStatus.warningIndicatorRequested,0:No;1:Yes\n" //
                        +"793,55,55,1,0,0,,1902AF,5902AF,ff,DTCStatus.testFailed,0:No;1:Yes\n" //
                        +"793,54,54,1,0,0,,1902AF,5902AF,ff,DTCStatus.testFailedThisMonitoringCycle,0:No;1:Yes\n" //
                        +"793,53,53,1,0,0,,1902AF,5902AF,ff,DTCStatus.pendingDTC,0:No;1:Yes\n" //
                        +"793,52,52,1,0,0,,1902AF,5902AF,ff,DTCStatus.confirmedDTC,0:No;1:Yes\n" //
                        +"793,51,51,1,0,0,,1902AF,5902AF,ff,DTCStatus.testNotCompletedSinceLastClear,0:No;1:Yes\n" //
                        +"793,50,50,1,0,0,,1902AF,5902AF,ff,DTCStatus.testFailedSinceLastClear,0:No;1:Yes\n" //
                        +"793,49,49,1,0,0,,1902AF,5902AF,ff,DTCStatus.testNotCompletedThisMonitoringCycle,0:No;1:Yes\n" //
                        +"793,40,47,1,0,0,,1902AF,5902AF,ff,DTCFailureType,0:Device and failure type ODB codding;1:General Electrical Failure;2:General signal failure;3:FM (Frequency Modulated) / PWM (Pulse Width Modulated) Failures;4:System Internal Failures;5:System Programming Failures;6:Algorithm Based Failures;7:Mechanical Failures;8:Bus Signal / Message Failures;9:Component Failures;17:circuit short to ground;18:circuit short to battery;19:circuit open;20:circuit short to ground or open;21:circuit short to battery or open;22:circuit voltage below threshold;23:circuit voltage above threshold;24:circuit current below threshold;25:circuit current above threshold;26:circuit resistance below threshold;27:circuit resistance above threshold;28:circuit voltage out of range;29:circuit current out of range;30:circuit resistance out of range;31:circuit intermittent;33:signal amplitude < minimum;34:signal amplitude > maximum;35:signal stuck low;36:signal stuck high;37:signal shape / waveform failure;38:signal rate of change below threshold;39:signal rate of change above threshold;40:signal bias level out of range / zero adjustment failure;41:signal signal invalid;47:signal erratic;49:no signal;50:signal low time < minimum;51:signal low time > maximum;52:signal high time < minimum;53:signal high time > maximum;54:signal frequency too low;55:signal frequency too high;56:signal frequency incorrect;57:incorrect has too few pulses;58:incorrect has too many pulses;65:general checksum failure;66:general memory failure;67:special memory failure;68:data memory failure;69:program memory failure;70:calibration / parameter memory failure;71:watchdog / safety µC failure;72:supervision software failure;73:internal electronic failure;74:incorrect component installed;75:over temperature;81:not programmed;82:not activated;83:deactivated;84:missing calibration;85:not configured;97:signal calculation failure;98:signal compare failure;99:circuit / component protection time-out;100:signal plausibility failure;101:signal has too few transitions / events;102:signal has too many transitions / events;103:signal incorrect after event;104:event information;113:actuator stuck;114:actuator stuck open;115:actuator stuck closed;116:actuator slipping;117:emergency position not reachable;118:wrong mounting position;119:commanded position not reachable;120:alignment or adjustment incorrect;121:mechanical linkage failure;122:fluid leak or seal failure;123:low fluid level;129:invalid serial data received;130:alive / sequence counter incorrect / not updated;131:value of signal protection calculation incorrect;132:signal below allowable range;133:signal above allowable range;134:signal invalid;135:missing message;136:bus off;143:erratic;145:parametric;146:performance or incorrect operation;147:no operation;148:unexpected operation;149:incorrect assembly;150:component internal failure;151:Component or system operation obstructed or blocked;152:component or system over temperature;241:Safety Case 1;242:Safety Case 2;243:Multiple Failure;244:Temperature too Low;245:Negative Loop Error;246:Positive Loop Error;247:Initialisation not valid;248:Overspeed;249:Limp Home;250:Specific Supplier;251:-;252:--;253:Drift low;254:Drift  high\n" //
                        +"793,24,39,1,0,0,,1902AF,5902AF,ff,DTCDeviceAndFailureTypeOBD\n" //
                        +"793,44,47,1,0,0,,1902AF,5902AF,ff,DTCFailureType.ManufacturerOrSupplier\n" //
                        +"793,16,23,1,0,0,,1902AF,5902AF,ff,DTCStatusAvailabilityMask\n" //
                        +"793,16,23,1,0,0,,1904000000FF,5904000000FF,ff,DTCRecord\n" //
                        +"793,40,47,1,0,0,,1904000000FF,5904000000FF,ff,StatusOfDTC\n" //
                        +"793,16,23,1,0,0,,190600000080,590600000080,ff,DTCRecord\n" //
                        +"793,40,47,1,0,0,,190600000080,590600000080,ff,StatusOfDTC\n" //
                        +"793,56,79,1,0,0,km,190600000080,590600000080,ff,DTCExtendedData.Mileage\n" //
                        +"793,16,23,1,0,0,,190600000081,590600000081,ff,DTCRecord\n" //
                        +"793,40,47,1,0,0,,190600000081,590600000081,ff,StatusOfDTC\n" //
                        +"793,48,55,1,0,0,,190600000081,590600000081,ff,DTCExtendedDataRecordNumber,128:Mileage;129:AgingCounter;130:DTCOccurrenceCounter;132:DTCOccurrenceCounter_2;133:DTCLastDiseappearMileage;134:DTCTravelledDistanceFailurePresent;135:DTCFirstAppearMileage\n" //
                        +"793,56,63,1,0,0,,190600000081,590600000081,ff,DTCExtendedData.AgingCounter\n" //
                        +"793,16,23,1,0,0,,190600000082,590600000082,ff,DTCRecord\n" //
                        +"793,40,47,1,0,0,,190600000082,590600000082,ff,StatusOfDTC\n" //
                        +"793,48,55,1,0,0,,190600000082,590600000082,ff,DTCExtendedDataRecordNumber,128:Mileage;129:AgingCounter;130:DTCOccurrenceCounter;132:DTCOccurrenceCounter_2;133:DTCLastDiseappearMileage;134:DTCTravelledDistanceFailurePresent;135:DTCFirstAppearMileage\n" //
                        +"793,56,63,1,0,0,,190600000082,590600000082,ff,DTCExtendedData.DTCOccurrenceCounter\n" //
                        +"793,16,23,1,0,0,,1906000000FF,5906000000FF,ff,DTCRecord\n" //
                        +"793,40,47,1,0,0,,1906000000FF,5906000000FF,ff,StatusOfDTC\n" //
                        +"793,56,63,1,0,0,,1906000000FF,5906000000FF,ff,DTCExtendedData.DTCOccurrenceCounter\n" //
                        +"793,48,55,1,0,0,,1906000000FF,5906000000FF,ff,DTCExtendedDataRecordNumber,128:Mileage;129:AgingCounter;130:DTCOccurrenceCounter;132:DTCOccurrenceCounter_2;133:DTCLastDiseappearMileage;134:DTCTravelledDistanceFailurePresent;135:DTCFirstAppearMileage\n" //
                        +"793,192,199,1,0,0,,2180,6180,ff,ApprovalNumber.BasicPartList,1:HMLGT\n" //
                        +"793,160,167,1,0,0,,2180,6180,ff,CalibrationNumber\n" //
                        +"793,56,63,1,0,0,,2180,6180,ff,DiagnosticIdentificationCode\n" //
                        +"793,144,151,1,0,0,,2180,6180,ff,EditionNumber\n" //
                        +"793,184,191,1,0,0,,2180,6180,ff,HardwareNumber.BasicPartList,1:296H5\n" //
                        +"793,88,95,1,0,0,,2180,6180,ff,HardwareNumber.LowerPart\n" //
                        +"793,200,207,1,0,0,,2180,6180,ff,ManufacturerIdentificationCode,0:Renault R1;128:Nissan N1;129:Nissan N2;130:Nissan N3;136:5DIGITS;255:Renault R3\n" //
                        +"793,176,183,1,0,0,,2180,6180,ff,PartNumber.BasicPartList,1:296H5;2:296H0\n" //
                        +"793,16,23,1,0,0,,2180,6180,ff,PartNumber.LowerPart\n" //
                        +"793,128,135,1,0,0,,2180,6180,ff,SoftwareNumber\n" //
                        +"793,64,71,1,0,0,,2180,6180,ff,SupplierNumber.ITG\n" //
                        +"793,152,159,1,0,0,,2181,6181,ff,Vin CRC\n" //
                        +"793,16,23,1,0,0,,2181,6181,ff,Vin In Ascii\n" //
                        +"793,16,23,1,0,0,,2184,6184,ff,ITG Supplier Number\n" //
                        +"793,40,47,1,0,0,,2184,6184,ff,Traceability Factory Code\n" //
                        +"793,48,55,1,0,0,,2184,6184,ff,Traceability Serial Number\n" //
                        +"793,16,23,1,0,0,,21B7,61B7,ff,Configuration of Electrical Vehicle Networks\n" //
                        +"793,16,23,1,0,0,,21B8,61B8,ff,List of Electrical Vehicle ECUs with After-sales diagnostic\n" //
                        +"793,16,23,1,0,0,,190600000084,590600000084,ff,DTCRecord\n" //
                        +"793,40,47,1,0,0,,190600000084,590600000084,ff,StatusOfDTC\n" //
                        +"793,56,63,1,0,0,,190600000084,590600000084,ff,DTCExtendedData.DTCOccurrenceCounter_2\n" //
                        +"793,16,23,1,0,0,,190600000085,590600000085,ff,DTCRecord\n" //
                        +"793,40,47,1,0,0,,190600000085,590600000085,ff,StatusOfDTC\n" //
                        +"793,56,79,1,0,0,km,190600000085,590600000085,ff,DTCExtendedData.DTCLastDiseappearMileage\n" //
                        +"793,16,23,1,0,0,,190600000086,590600000086,ff,DTCRecord\n" //
                        +"793,40,47,1,0,0,,190600000086,590600000086,ff,StatusOfDTC\n" //
                        +"793,56,79,1,0,0,km,190600000086,590600000086,ff,DTCExtendedData.DTCTravelledDistanceFailurePresent\n" //
                        +"793,16,23,1,0,0,,190600000087,590600000087,ff,DTCRecord\n" //
                        +"793,40,47,1,0,0,,190600000087,590600000087,ff,StatusOfDTC\n" //
                        +"793,56,79,1,0,0,km,190600000087,590600000087,ff,DTCExtendedData.DTCFirstAppearMileage\n" //
                        +"793,160,167,1,0,0,,21F0,61F0,ff,CalibrationNumber\n" //
                        +"793,56,63,1,0,0,,21F0,61F0,ff,DiagnosticIdentificationCode\n" //
                        +"793,128,135,1,0,0,,21F0,61F0,ff,SoftwareNumber\n" //
                        +"793,64,71,1,0,0,,21F0,61F0,ff,SupplierNumber\n" //
                        +"793,144,151,1,0,0,,21F0,61F0,ff,EditionNumber\n" //
                        +"793,176,183,1,0,0,,21F0,61F0,ff,PartNumber.BasicPartList,1:296H5;2:296H0\n" //
                        +"793,184,191,1,0,0,,21F0,61F0,ff,HardwareNumber.BasicPartList,1:296H5\n" //
                        +"793,192,199,1,0,0,,21F0,61F0,ff,ApprovalNumber.BasicPartList,1:HMLGT\n" //
                        +"793,16,23,1,0,0,,21F0,61F0,ff,PartNumber.LowerPart\n" //
                        +"793,88,95,1,0,0,,21F0,61F0,ff,HardwareNumber.LowerPart\n" //
                        +"793,200,207,1,0,0,,21F0,61F0,ff,ManufacturerIdentificationCode,0:Renault R1;128:Nissan N1;129:Nissan N2;130:Nissan N3;136:5DIGITS;255:Renault R3\n" //
                        +"793,16,23,1,0,0,,21F1,61F1,ff,ApprovalNumber.LowerPart\n" //
                        +"793,56,63,1,0,0,,21F1,61F1,ff,ProgrammingSiteReference\n" //
                        +"793,96,103,1,0,0,,21F1,61F1,ff,ProgrammingToolReference\n" //
                        +"793,136,143,1,0,0,,21F1,61F1,ff,NumberOfReprogrammings\n" //
                        +"793,144,151,1,0,0,,21F1,61F1,ff,DateOfReprogramming\n" //
                        +"793,184,191,1,0,0,,21F1,61F1,ff,SaveMarking\n" //
                        +"793,192,199,1,0,0,,21F1,61F1,ff,CrcOfLogSave\n" //
                        +"793,168,175,1,0,0,,21F1,61F1,ff,TimeOfReprogramming\n" //
                        +"793,24,39,.0625,3200,0,A,222001,622001,ff,Mains phase 1 current RMS value\n" //
                        +"793,24,39,.0625,0,0,V,222002,622002,ff,CPU voltage supply from BI\n" //
                        +"793,25,31,1,0,0,%,225007,625007,ff,MMI Green LED PWM request\n" //
                        +"793,31,31,1,0,0,,225012,625012,ff,Mains phase 1-2 voltage presence,0:Absent;1:Present\n" //
                        +"793,31,31,1,0,0,,225013,625013,ff,Mains phase 2-3 voltage presence,0:Absent;1:Present\n" //
                        +"793,31,31,1,0,0,,225014,625014,ff,Mains phase 3-1 voltage presence,0:Absent;1:Present\n" //
                        +"793,25,31,1,0,0,%,22502F,62502F,ff,MMI Red LED PWM request\n" //
                        +"793,31,31,1,0,0,,225030,625030,ff,Raw fuse interlock value,0:open;1:closed\n" //
                        +"793,31,31,1,0,0,,225031,625031,ff,Raw Relay box plug interlock closed,0:open;1:closed\n" //
                        +"793,24,39,1,0,0,V,225032,625032,ff,Driver module power supply voltage from BI\n" //
                        +"793,24,39,.0625,32768,0,mA,225035,625035,ff,Mains ground current 1st measurement\n" //
                        +"793,24,39,.0625,32768,0,mA,225036,625036,ff,Mains ground current 2nd measurement\n" //
                        +"793,31,31,1,0,0,,225038,625038,ff,Mains Plug Locking Switch raw information,0:Unlocked;1:Locked\n" //
                        +"793,30,31,1,0,0,,225039,625039,ff,Mains plug locking control,0:No motion;1:Close;2:Open\n" //
                        +"793,24,39,.0625,3200,0,A,22503A,62503A,ff,Mains phase 2 current RMS value\n" //
                        +"793,24,39,.0625,3200,0,A,22503B,62503B,ff,Mains phase 3 current RMS value\n" //
                        +"793,24,39,.0625,3200,0,A,22503C,62503C,ff,Mains current phase 1 mean value\n" //
                        +"793,24,39,.0625,3200,0,A,22503D,62503D,ff,Mains current phase 2 mean value\n" //
                        +"793,24,39,.0625,3200,0,A,22503E,62503E,ff,Mains current phase 3 mean value\n" //
                        +"793,24,39,.5,0,0,V,22503F,62503F,ff,Mains phase 1-2 voltage RMS value\n" //
                        +"793,24,39,.5,0,0,V,225041,625041,ff,Mains phase 2-3 voltage RMS value\n" //
                        +"793,24,39,.5,0,0,V,225042,625042,ff,Mains phase 3-1 voltage RMS value\n" //
                        +"793,24,39,.5,32000,0,V,225043,625043,ff,AC mains phase 1-2 measured voltage\n" //
                        +"793,24,39,.5,32000,0,V,225044,625044,ff,AC mains phase 2-3 measured voltage\n" //
                        +"793,24,39,.5,32000,0,V,225045,625045,ff,AC mains phase 3-1 measured voltage\n" //
                        +"793,24,39,.5,32000,0,V,225046,625046,ff,Mains phase 1-2 mean voltage\n" //
                        +"793,24,39,.5,32000,0,V,225047,625047,ff,Mains phase 2-3 mean voltage\n" //
                        +"793,24,39,.5,32000,0,V,225048,625048,ff,Mains phase 3-1 mean voltage\n" //
                        +"793,24,39,.0078125,-1280,0,Hz,225049,625049,ff,Mains phase frequency\n" //
                        +"793,24,39,1,20000,0,W,22504A,62504A,ff,Mains active power consumed\n" //
                        +"793,24,39,.0625,9600,0,A,22504B,62504B,ff,Mains current sum\n" //
                        +"793,24,39,.5,32000,0,V,22504C,62504C,ff,Mains voltage sum\n" //
                        +"793,24,39,.0625,3200,0,A,22504D,62504D,ff,HV Network measured current\n" //
                        +"793,24,39,1,1023,0,V,22504E,62504E,ff,HV voltage\n" //
                        +"793,24,31,1,0,0,,22504F,62504F,ff,Mains leakage current strategy state,0:OFF/Init;1:OK;2:NOK\n" //
                        +"793,24,24,1,0,0,,225050,625050,ff,External controls denial status flags.0,0:Reserved for future use_0\n" //
                        +"793,24,31,1,0,0,%,222004,622004,ff,System Relative Temperature in %\n" //
                        +"793,24,39,.0002441406,0,0,V,225033,625033,ff,Raw Detection Logic line value\n" //
                        +"793,24,31,1,40,0,°C,225051,625051,ff,CPU temperature value\n" //
                        +"793,24,31,1,40,0,°C,225052,625052,ff,IGBT Buck arm 1 temperature\n" //
                        +"793,24,31,1,40,0,°C,225053,625053,ff,Raw IGBT Buck arm 1 temperature\n" //
                        +"793,24,31,1,40,0,°C,225054,625054,ff,Mains input filter hot spot temperature\n" //
                        +"793,24,31,1,40,0,°C,225055,625055,ff,Mains input filter hot spot temperature from SPI\n" //
                        +"793,24,31,1,40,0,°C,225056,625056,ff,Mains input filter temperature\n" //
                        +"793,24,39,.0625,32768,0,mA,225057,625057,ff,Raw leakage current - DC part measurement\n" //
                        +"793,24,39,.0625,32768,0,mA,225058,625058,ff,Raw leakage current - High Frequency 10kHz part measurement\n" //
                        +"793,24,39,.0625,32768,0,mA,225059,625059,ff,Raw leakage current - High Frequency 1st part measurement\n" //
                        +"793,24,39,.0625,32768,0,mA,22505A,62505A,ff,Raw leakage current - Low Frequency part measurement (50Hz)\n" //
                        +"793,16,23,1,0,0,,21EF,61EF,ff,Hardware Part Number 1\n" //
                        +"793,24,31,1,0,0,,21EF,61EF,ff,Hardware Part Number 2\n" //
                        +"793,32,39,1,0,0,,21EF,61EF,ff,Hardware Part Number 3\n" //
                        +"793,40,47,1,0,0,,21EF,61EF,ff,Hardware Part Number 4\n" //
                        +"793,48,55,1,0,0,,21EF,61EF,ff,Hardware Part Number 5\n" //
                        +"793,56,63,1,0,0,,21EF,61EF,ff,Hardware Part Number 6\n" //
                        +"793,64,71,1,0,0,,21EF,61EF,ff,Hardware Part Number 7\n" //
                        +"793,72,79,1,0,0,,21EF,61EF,ff,Hardware Part Number 8\n" //
                        +"793,80,87,1,0,0,,21EF,61EF,ff,Hardware Part Number 9\n" //
                        +"793,88,95,1,0,0,,21EF,61EF,ff,Hardware Part Number 10\n" //
                        +"793,96,103,1,0,0,,21EF,61EF,ff,Software Part Number 1\n" //
                        +"793,104,111,1,0,0,,21EF,61EF,ff,Software Part Number 2\n" //
                        +"793,112,119,1,0,0,,21EF,61EF,ff,Software Part Number 3\n" //
                        +"793,120,127,1,0,0,,21EF,61EF,ff,Software Part Number 4\n" //
                        +"793,128,135,1,0,0,,21EF,61EF,ff,Software Part Number 5\n" //
                        +"793,136,143,1,0,0,,21EF,61EF,ff,Software Part Number 6\n" //
                        +"793,144,151,1,0,0,,21EF,61EF,ff,Software Part Number 7\n" //
                        +"793,152,159,1,0,0,,21EF,61EF,ff,Software Part Number 8\n" //
                        +"793,160,167,1,0,0,,21EF,61EF,ff,Software Part Number 9\n" //
                        +"793,168,175,1,0,0,,21EF,61EF,ff,Software Part Number 10\n" //
                        +"793,31,31,1,0,0,,22505B,62505B,ff,Virgin neutral current acquisition tuning detection\n" //
                        +"793,31,31,1,0,0,,22505C,62505C,ff,Inform on spi communication error\n" //
                        +"793,31,31,1,0,0,,22505D,62505D,ff,Global checksum result on SPI frames\n" //
                        +"793,24,39,1,0,0,,22505E,62505E,ff,FPGA ident\n" //
                        +"793,24,39,1,0,0,ms,225061,625061,ff,Low part of CPU clock since power up\n" //
                        +"793,24,39,1,0,0,ms,22505F,62505F,ff,High part of CPU clock since power up\n" //
                        +"793,24,39,1,0,0,Ohm,225062,625062,ff,Mains ground resistance\n" //
                        +"793,24,31,1,0,0,,225063,625063,ff,Supervisor state,0:Init;1:Wait;2:ClosingS2;3:InitType;4:InitLkg;5:InitChg;6:Charge;7:ZeroAmpMode;8:EndOfChg;9:OpeningS2;10:ReadyToSleep;11:EmergencyStop;12:InitChargeDF;13:OCPStop;14:WaitS2\n" //
                        +"793,24,31,1,0,0,,225064,625064,ff,Leakage current diagnostic stored completion status,0:init;1:HF10;3:Mains Ground Default;5:Earth Current default;9:Ground Default;17:Means Leakage DC;33:Means Leakage LF;49:Means Leakage DC+LF;65:Means Leakage HF;81:Means Leakage DC+HF;97:Means Leakage LF+HF;113:Means Leakage DC+LF+HF\n" //
                        +"793,24,39,1,32768,0,mA,225065,625065,ff,Leakage DC current saved indicator after failure\n" //
                        +"793,24,39,1,32768,0,mA,225066,625066,ff,Leakage HF 10kHz current saved indicator after failure\n" //
                        +"793,24,39,1,32768,0,mA,225067,625067,ff,Leakage HF current saved indicator after failure\n" //
                        +"793,24,39,1,32768,0,mA,225068,625068,ff,Leakage LF current saved indicator after failure\n" //
                        +"793,24,31,1,0,0,,225069,625069,ff,LED absence configuration,0:LED present;1:LED absent\n" //
                        +"793,24,39,1,0,0,,22506C,62506C,ff,15V from Driver flyback\n" //
                        +"793,24,31,1,0,0,,22506A,62506A,ff,Old MMI configuration,0:New MMI;1:Old MMI\n" //
                        +"793,24,31,1,0,0,,22506B,62506B,ff,Vehicle configuration type,0:X10 configuration;1:X07 configuration\n" //
                        +"793,24,39,1,0,0,,22506D,62506D,ff,Saved number of quickdrop values\n" //

                ;

        String fieldDefBcb = // ID (hex), startBit, endBit, resolution, offset (aplied BEFORE resolution multiplication), decimals, unit, requestID (hex string), responseID (hex string),
                // options (hex, see MainActivity for definitions), optional name, optional list
                ""
                        +"793,24,31,.08,0,0,V,223101,623101,ff,Batt_voltage_mes\n" //
                        +"793,31,39,1,0,0,V,223102,623102,ff,BCBHighVoltage\n" //
                        +"793,24,31,1,0,0,%,223103,623103,ff,BCBTemp\n" //
                        +"793,24,31,1,40,0,°C,223104,623104,ff,BCBWaterTemp\n" //
                        +"793,27,31,1,0,0,,223106,623106,ff,DomesticNetworkType,0:Unvailable Value;1:FRANCE;2:JP 1;3:JP 2;4:JP 3;5:JP 4;6:USA\n" //
                        +"793,31,31,1,0,0,,223107,623107,ff,DID3107.ILOCK_CLIMA,0:Open;1:Close\n" //
                        +"793,30,30,1,0,0,,223107,623107,ff,DID3107.ILOCK_PTC,0:Open;1:Close\n" //
                        +"793,29,29,1,0,0,,223107,623107,ff,DID3107.ILOCK_MAINS_LEFT,0:Open;1:Close\n" //
                        +"793,28,28,1,0,0,,223107,623107,ff,DID3107.ILOCK_MAINS_RIGHT,0:Open;1:Close\n" //
                        +"793,27,27,1,0,0,,223107,623107,ff,DID3107.ILOCK_PEB,0:Open;1:Close\n" //
                        +"793,26,26,1,0,0,,223107,623107,ff,DID3107.ILOCK_BAT,0:Open;1:Close\n" //
                        +"793,25,25,1,0,0,,223107,623107,ff,DID3107.ED_Cover_SW,0:Open;1:Close\n" //
                        +"793,24,24,1,0,0,,223107,623107,ff,DID3107.Interlock_sec_connector_sts,0:Close;1:Open\n" //
                        +"793,29,31,1,0,0,,223108,623108,ff,DID3108.BCBLoadState,0:Unvailable Value;1:SlowCharge and Diag State;2:Quick Charge and Diag State;3:Nissan Quick Charge and Diag State;4:Diagnosis State;5:No State;6:Not used\n" //
                        +"793,39,39,1,0,0,,223108,623108,ff,DID3108.BCBPerformance,0:Normal Performance;1:derating mode active\n" //
                        +"793,38,38,1,0,0,,223108,623108,ff,DID3108.Ctrl_Relay_DCDC_P,0:Relay is Open;1:Relay is Closed\n" //
                        +"793,37,37,1,0,0,,223108,623108,ff,DID3108.Wake_Up_System,0:Wake_Up is not requested;1:Wake Up is being requested\n" //
                        +"793,25,27,1,0,0,,223108,623108,ff,DID3108.BCBFaultClass,0:No default;1:Class A;2:Class B;3:Class C;4:Class D;5:Class E;6:Not used\n" //
                        +"793,35,35,1,0,0,,223108,623108,ff,DID3108.SwitchingBoxRelay1State,0:Relay Open;1:Relay Closed\n" //
                        +"793,36,36,1,0,0,,223108,623108,ff,DID3108.BCBPowerPlantState,0:Power Plant Off;1:Power Plant On\n" //
                        +"793,34,34,1,0,0,,223108,623108,ff,DID3108.SwitchingBoxRelay2State,0:Relay Open;1:Relay Closed\n" //
                        +"793,28,28,1,0,0,,22310A,62310A,ff,DID310A.DomesticNetworkState,0:Domestic Network is not present;1:Domestic Network is present\n" //
                        +"793,29,31,1,0,0,,22310A,62310A,ff,DID310A.ChargingPlugConnectionState 1,0:DL_OPEN_LOAD;1:DL_NOT_CONNECTED;2:DL_CONNECTED_NOT_LOCKED;3:DL_CONNECTED_AND_LOCKED;4:DL_SCTOGND_UNDERVOLTAGE\n" //
                        +"793,25,27,1,0,0,,22310A,62310A,ff,DID310A.ChargingPlugConnectionState 2,0:DL_OPEN_LOAD;1:DL_NOT_CONNECTED;2:DL_CONNECTED_NOT_LOCKED;3:DL_CONNECTED_AND_LOCKED;4:DL_SCTOGND_UNDERVOLTAGE\n" //
                        +"793,24,24,1,0,0,,22310A,62310A,ff,DID310A.Earth plug connection,0:Ground Connection failure;1:Ground is correct\n" //
                        +"793,24,31,1,-40,0,,22310B,62310B,ff,Mains Voltage\n" //
                        +"793,25,31,.1,0,0,,22310D,62310D,ff,SlowChargingMaxPower\n" //
                        +"793,24,31,1,0,0,,22310E,62310E,ff,ChargerCurrent\n" //
                        +"793,25,31,1,-32,0,,22310F,62310F,ff,ChargerMaxCurrent\n" //
                        +"793,31,39,1,0,0,,223110,623110,ff,ChargerVoltage\n" //
                        +"793,24,31,1,-240,0,,223111,623111,ff,ChargerMaxVoltage\n" //
                        +"793,24,31,1,0,0,,223112,623112,ff,ChargerCurrentSlope\n" //
                        +"793,26,31,1,0,0,,223113,623113,ff,ChargerMaxPower\n" //
                        +"793,26,31,1,0,0,,223114,623114,ff,ChargerMinCurrent\n" //
                        +"793,24,31,1,-240,0,,223115,623115,ff,ChargerMinVoltage\n" //
                        +"793,31,31,1,0,0,,223119,623119,ff,DID3119.QuickChargeStopRequest,0:Quick Charge Stop Not Requested;1:Quick Charge Stop  Requested\n" //
                        +"793,30,30,1,0,0,,223119,623119,ff,DID3119.QuickChargeEmergencyStop,0:Quick Charge Emergency Stop Not Requested;1:Quick Charge Emergency Stop Requested\n" //
                        +"793,29,29,1,0,0,,223119,623119,ff,DID3119.KLineState,0:K Line Not present;1:K Line present\n" //
                        +"793,28,28,1,0,0,,223119,623119,ff,DID3119.QuickChargeSessionStopRequest,0:Quick Charge Session Stop Not Requested;1:Quick Charge Session Stop Requested\n" //
                        +"793,30,31,1,0,0,,223120,623120,ff,DID3120.QuickChargeLimitsACK,0:unavailable value;1:Charger has received Security Limits;2:Charger has not received Security Limits;3:reserved\n" //
                        +"793,28,29,1,0,0,,223120,623120,ff,DID3120.QuickChargeStopACK,0:unavailable value;1:Charger has received Stop Request;2:Charger has not received Stop Request;3:reserved\n" //
                        +"793,26,27,1,0,0,,223120,623120,ff,DID3120.QuickChargeStartACK,0:unavailable value;1:Charger has received Start Request;2:Charger has not received Start Request;3:reserved\n" //
                        +"793,24,25,1,0,0,,223120,623120,ff,DID3120.QuickChargeTempStopACK,0:unavailable value;1:Charger has received Temp Stop Request;2:Charger has not received Temp Stop Request;3:reserved\n" //
                        +"793,30,31,1,0,0,,22312D,62312D,ff,InterlockBatt,0:Unvailable Value;1:Open;2:Closed;3:Not used\n" //
                        +"793,28,39,10,2000,0,rpm,22312E,62312E,ff,ElecMachineSpeed\n" //
                        +"793,24,47,1,0,0,,223130,623130,ff,DistanceTotalizer\n" //
                        +"793,29,31,1,0,0,,223132,623132,ff,BCBState,0:Unavailable Value;1:Slow Charge, Zero Amp, Diag;2:Quick Charge, Diag state;3:Nissan Quick Charge, Diag state;4:Diagnosis state;5:No state;6:not used;7:Not Used\n" //
                        +"793,24,31,.1,0,0,,223133,623133,ff,SlowChargingCurrent\n" //
                        +"793,24,31,1,0,0,,223134,623134,ff,QuickChargeCurrent\n" //
                        +"793,24,31,1,0,0,,223135,623135,ff,QuickChargeCurrentLimit\n" //
                        +"793,24,31,1,-240,0,,223136,623136,ff,QuickChargeVoltageLimit\n" //
                        +"793,31,31,1,0,0,,223137,623137,ff,DID3137.QuickChargeStartRequest,0:Quick Charge start Not Requested;1:Quick Charge start Requested\n" //
                        +"793,30,30,1,0,0,,223137,623137,ff,DID3137.QuickChargeSessionStopRequest,0:Quick Charge Session Stop Not Requested;1:Quick Charge Session Stop Requested\n" //
                        +"793,29,29,1,0,0,,223137,623137,ff,DID3137.QuickChargeTempStopRequest,0:QCharge Temporary Stop Not Requested;1:QCharge Temporary Stop Requested\n" //
                        +"793,31,31,1,0,0,0,22FFF0,62FFF0,ff,DIDFFF0.Derating_Mode_Active\n" //
                        +"793,30,30,1,0,0,0,22FFF0,62FFF0,ff,DIDFFF0.PFC_On_Off_Status\n" //
                        +"793,29,29,1,0,0,0,22FFF0,62FFF0,ff,DIDFFF0.Input_Overcurrent_Alarm\n" //
                        +"793,28,28,1,0,0,0,22FFF0,62FFF0,ff,DIDFFF0.Input_PFC_Undervoltage_Alarm\n" //
                        +"793,27,27,1,0,0,0,22FFF0,62FFF0,ff,DIDFFF0.Input_Overvoltage_Alarm\n" //
                        +"793,26,26,1,0,0,0,22FFF0,62FFF0,ff,DIDFFF0.Output_PFC_Overvoltage_Alarm\n" //
                        +"793,25,25,1,0,0,0,22FFF0,62FFF0,ff,DIDFFF0.Cooling_Overtermperature_Alarm\n" //
                        +"793,24,24,1,0,0,0,22FFF0,62FFF0,ff,DIDFFF0.DCDC_On_Off_Status\n" //
                        +"793,39,39,1,0,0,0,22FFF0,62FFF0,ff,DIDFFF0.Output_Overcurrent_Alarm\n" //
                        +"793,38,38,1,0,0,0,22FFF0,62FFF0,ff,DIDFFF0.Input_DCDC_Undervoltage_Alarm\n" //
                        +"793,37,37,1,0,0,0,22FFF0,62FFF0,ff,DIDFFF0.Output_DCDC_Overvoltage_Alarm\n" //
                        +"793,36,36,1,0,0,0,22FFF0,62FFF0,ff,DIDFFF0.Primary_Hardware_Alarm\n" //
                        +"793,35,35,1,0,0,0,22FFF0,62FFF0,ff,DIDFFF0.Secondary_Hardware_Alarm\n" //
                        +"793,34,34,1,0,0,0,22FFF0,62FFF0,ff,DIDFFF0.Output_Short_Circuit_Alarm\n" //
                        +"793,33,33,1,0,0,0,22FFF0,62FFF0,ff,DIDFFF0.SCI_Error\n" //
                        +"793,32,32,1,0,0,0,22FFF0,62FFF0,ff,DIDFFF0.Interlock_sec_connector_sts\n" //
                        +"793,40,47,1,40,0,-40,22FFF0,62FFF0,ff,DIDFFF0.Final_Ambient_temperature\n" //
                        +"793,54,55,1,0,0,0,22FFF0,62FFF0,ff,DIDFFF0.Mains_Frequency\n" //
                        +"793,48,53,.5,0,0,A,22FFF0,62FFF0,ff,DIDFFF0.DCDC_Output_Current\n" //
                        +"793,56,63,1,-40,0,V,22FFF0,62FFF0,ff,DIDFFF0.Mains_Voltage\n" //
                        +"793,64,72,1,0,0,V,22FFF0,62FFF0,ff,DIDFFF0.DCDC_output_voltage\n" //
                        +"793,73,81,1,0,0,0,22FFF0,62FFF0,ff,DIDFFF0.HV_Bus_meas_voltage\n" //
                        +"793,85,85,1,0,0,0,22FFF0,62FFF0,ff,DIDFFF0.Status_FCHG_N_Relay\n" //
                        +"793,84,84,1,0,0,0,22FFF0,62FFF0,ff,DIDFFF0.Status_FCHG_P_Relay\n" //
                        +"793,88,95,.5,0,0,A,22FFF0,62FFF0,ff,DIDFFF0.Input_current\n" //
                        +"793,31,31,1,0,0,0,22FFF1,62FFF1,ff,DIDFFF1.Charger_On_Off\n" //
                        +"793,27,30,1,-10,0,A,22FFF1,62FFF1,ff,DIDFFF1.Input_Current_Limit\n" //
                        +"793,26,26,1,0,0,0,22FFF1,62FFF1,ff,DIDFFF1.FCHG_Vdrop_Relay_P\n" //
                        +"793,25,25,1,0,0,0,22FFF1,62FFF1,ff,DIDFFF1.FCHG_Vdrop_Relay_N\n" //
                        +"793,24,24,1,0,0,0,22FFF1,62FFF1,ff,DIDFFF1.PFC_Alarm_Reset\n" //
                        +"793,35,39,.5,0,0,A,22FFF1,62FFF1,ff,DIDFFF1.Set_Output_Max_Current\n" //
                        +"793,40,47,1,40,0,°C,22FFF1,62FFF1,ff,DIDFFF1.Ambient_Temp\n" //
                        +"793,48,55,1,40,0,°C,22FFF1,62FFF1,ff,DIDFFF1.Cooling_Temp\n" //
                        +"793,48,48,1,0,0,,1902FF,5902FF,ff,DTCStatus.warningIndicatorRequested,0:No;1:Yes\n" //
                        +"793,55,55,1,0,0,,1902FF,5902FF,ff,DTCStatus.testFailed,0:No;1:Yes\n" //
                        +"793,54,54,1,0,0,,1902FF,5902FF,ff,DTCStatus.testFailedThisMonitoringCycle,0:No;1:Yes\n" //
                        +"793,53,53,1,0,0,,1902FF,5902FF,ff,DTCStatus.pendingDTC,0:No;1:Yes\n" //
                        +"793,52,52,1,0,0,,1902FF,5902FF,ff,DTCStatus.confirmedDTC,0:No;1:Yes\n" //
                        +"793,51,51,1,0,0,,1902FF,5902FF,ff,DTCStatus.testNotCompletedSinceLastClear,0:No;1:Yes\n" //
                        +"793,50,50,1,0,0,,1902FF,5902FF,ff,DTCStatus.testFailedSinceLastClear,0:No;1:Yes\n" //
                        +"793,49,49,1,0,0,,1902FF,5902FF,ff,DTCStatus.testNotCompletedThisMonitoringCycle,0:No;1:Yes\n" //
                        +"793,40,47,1,0,0,,1902FF,5902FF,ff,DTCFailureType,0:Device and failure type ODB codding;1:General Electrical Failure;2:General signal failure;3:FM / PWM Failures;4:System Internal Failures;5:System Programming Failures;6:Algorithm Based Failures;7:Mechanical Failures;8:Bus Signal / Message Failures;9:Component Failures;17:circuit short to ground;18:circuit short to battery;19:circuit open;20:circuit short to ground or open;21:circuit short to battery or open;22:circuit voltage below threshold;23:circuit voltage above threshold;24:circuit current below threshold;25:circuit current above threshold;26:circuit resistance below threshold;27:circuit resistance above threshold;28:circuit voltage out of range;29:circuit current out of range;30:circuit resistance out of range;31:circuit intermittent;33:signal amplitude < minimum;34:signal amplitude > maximum;35:signal stuck low;36:signal stuck high;37:signal shape / waveform failure;38:signal rate of change below threshold;39:signal rate of change above threshold;40:signal bias level out of range;41:signal signal invalid;47:signal erratic;49:no signal;50:signal low time < minimum;51:signal low time > maximum;52:signal high time < minimum;53:signal high time > maximum;54:signal frequency too low;55:signal frequency too high;56:signal frequency incorrect;57:incorrect has too few pulses;58:incorrect has too many pulses;65:general checksum failure;66:general memory failure;67:special memory failure;68:data memory failure;69:program memory failure;70:calibration / parameter memory failure;71:watchdog / safety µC failure;72:supervision software failure;73:internal electronic failure;74:incorrect component installed;75:over temperature;81:not programmed;82:not activated;83:deactivated;84:missing calibration;85:not configured;97:signal calculation failure;98:signal compare failure;99:circuit / component protection time-out;100:signal plausibility failure;101:signal has too few transitions / events;102:signal has too many transitions / events;103:signal incorrect after event;104:event information;113:actuator stuck;114:actuator stuck open;115:actuator stuck closed;116:actuator slipping;117:emergency position not reachable;118:wrong mounting position;119:commanded position not reachable;120:alignment or adjustment incorrect;121:mechanical linkage failure;122:fluid leak or seal failure;123:low fluid level;129:invalid serial data received;130:alive / sequence counter incorrect / not updated;131:value of signal protection calculation incorrect;132:signal below allowable range;133:signal above allowable range;134:signal invalid;135:missing message;136:bus off;143:erratic;145:parametric;146:performance or incorrect operation;147:no operation;148:unexpected operation;149:incorrect assembly;150:component internal failure;151:Component or system operation obstructed/blocked;152:component or system over temperature\n" //
                        +"793,24,39,1,0,0,,1902FF,5902FF,ff,DTCDeviceAndFailureTypeOBD\n" //
                        +"793,44,47,1,0,0,,1902FF,5902FF,ff,DTCFailureType.ManufacturerOrSupplier\n" //
                        +"793,16,23,1,0,0,,1902FF,5902FF,ff,DTCStatusAvailabilityMask\n" //
                        +"793,16,23,1,0,0,,1906000000FF,5906000000FF,ff,DTCRecord\n" //
                        +"793,40,47,1,0,0,,1906000000FF,5906000000FF,ff,StatusOfDTC\n" //
                        +"793,56,79,1,0,0,km,1906000000FF,5906000000FF,ff,DTCExtendedData.Mileage\n" //
                        +"793,48,55,1,0,0,,1906000000FF,5906000000FF,ff,DTCExtendedDataRecordNumber,128:Mileage;129:AgingCounter;130:DTCOccurrenceCounter\n" //
                        +"793,16,23,1,0,0,,1904000000FF,5904000000FF,ff,DTCRecord\n" //
                        +"793,40,47,1,0,0,,1904000000FF,5904000000FF,ff,StatusOfDTC\n" //
                        +"793,24,31,1,0,0,,22F180,62F180,ff,bootSoftwareIdentification\n" //
                        +"793,16,23,1,0,0,,190600000080,590600000080,ff,DTCRecord\n" //
                        +"793,40,47,1,0,0,,190600000080,590600000080,ff,StatusOfDTC\n" //
                        +"793,56,79,1,0,0,km,190600000080,590600000080,ff,DTCExtendedData.Mileage\n" //
                        +"793,48,55,1,0,0,,190600000080,590600000080,ff,DTCExtendedDataRecordNumber,128:Mileage;129:AgingCounter;130:DTCOccurrenceCounter\n" //
                        +"793,16,23,1,0,0,,190600000081,590600000081,ff,DTCRecord\n" //
                        +"793,40,47,1,0,0,,190600000081,590600000081,ff,StatusOfDTC\n" //
                        +"793,56,63,1,0,0,,190600000081,590600000081,ff,DTCExtendedData.AgingCounter\n" //
                        +"793,48,55,1,0,0,,190600000081,590600000081,ff,DTCExtendedDataRecordNumber,128:Mileage;129:AgingCounter;130:DTCOccurrenceCounter\n" //
                        +"793,16,23,1,0,0,,190600000082,590600000082,ff,DTCRecord\n" //
                        +"793,40,47,1,0,0,,190600000082,590600000082,ff,StatusOfDTC\n" //
                        +"793,56,63,1,0,0,,190600000082,590600000082,ff,DTCExtendedData.DTCOccurrenceCounter\n" //
                        +"793,48,55,1,0,0,,190600000082,590600000082,ff,DTCExtendedDataRecordNumber,128:Mileage;129:AgingCounter;130:DTCOccurrenceCounter\n" //
                        +"793,24,31,.1,0,0,A,223105,623105,ff,BCBSlowChargeInputCurrent\n" //
                        +"793,24,31,.1,0,0,A,223109,623109,ff,EVSECurrentLimit\n" //
                        +"793,30,30,1,0,0,,22310C,62310C,ff,DID310C.Current_Ilimit,0:Not Pushed;1:Pushed\n" //
                        +"793,31,31,1,0,0,,22310C,62310C,ff,DID310C.O_LED_Ilimit,0:Off ;1:ON\n" //
                        +"793,29,29,1,0,0,,22310C,62310C,ff,DID310C.CTRL_ToCharge_J1772,0:Open;1:Closed\n" //
                        +"793,24,31,1,0,0,,223118,623118,ff,FastChargerReference\n" //
                        +"793,24,39,1,0,0,,22312F,62312F,ff,Quick drop counter\n" //
                        +"793,24,31,100,0,0,%,223139,623139,ff,EPWM_Pilot\n" //
                        +"793,24,31,.5,0,0,A,22313A,62313A,ff,DCDC_Output_Current\n" //
                        +"793,192,199,1,0,0,,2180,6180,ff,ApprovalNumber.BasicPartList,0:N/A;1:8200x\n" //
                        +"793,160,167,1,0,0,,2180,6180,ff,CalibrationNumber\n" //
                        +"793,56,63,1,0,0,,2180,6180,ff,DiagnosticIdentificationCode\n" //
                        +"793,144,151,1,0,0,,2180,6180,ff,EditionNumber\n" //
                        +"793,184,191,1,0,0,,2180,6180,ff,HardwareNumber.BasicPartList,0:N/A;1:29609\n" //
                        +"793,88,95,1,0,0,,2180,6180,ff,HardwareNumber.LowerPart\n" //
                        +"793,200,207,1,0,0,,2180,6180,ff,ManufacturerIdentificationCode,0:Renault R1;128:Nissan N1;129:Nissan N2;130:Nissan N3;136:5DIGITS;255:Renault R3\n" //
                        +"793,176,183,1,0,0,,2180,6180,ff,PartNumber.BasicPartList,0:N/A;2:29609\n" //
                        +"793,16,23,1,0,0,,2180,6180,ff,PartNumber.LowerPart\n" //
                        +"793,128,135,1,0,0,,2180,6180,ff,SoftwareNumber\n" //
                        +"793,64,71,1,0,0,,2180,6180,ff,SupplierNumber.ITG\n" //
                        +"793,152,159,1,0,0,,2181,6181,ff,Vin CRC\n" //
                        +"793,16,23,1,0,0,,2181,6181,ff,Vin In Ascii\n" //
                        +"793,148,155,1,0,0,,2184,6184,ff,PaddingDatas\n" //
                        +"793,136,143,1,0,0,,2184,6184,ff,Siemens serial number Byte 0 to be coded in ASCII\n" //
                        +"793,128,135,1,0,0,,2184,6184,ff,Siemens serial number Byte 1 to be coded in ASCII\n" //
                        +"793,56,63,1,0,0,,2184,6184,ff,Siemens serial number Byte 10 to be coded in ASCII\n" //
                        +"793,48,55,1,0,0,,2184,6184,ff,Siemens serial number Byte 11 to be coded in ASCII\n" //
                        +"793,40,47,1,0,0,,2184,6184,ff,Siemens serial number Byte 12 to be coded in ASCII\n" //
                        +"793,32,39,1,0,0,,2184,6184,ff,Siemens serial number Byte 13 to be coded in ASCII\n" //
                        +"793,24,31,1,0,0,,2184,6184,ff,Siemens serial number Byte 14 to be coded in ASCII\n" //
                        +"793,16,23,1,0,0,,2184,6184,ff,Siemens serial number Byte 15 to be coded in ASCII\n" //
                        +"793,120,127,1,0,0,,2184,6184,ff,Siemens serial number Byte 2 to be coded in ASCII\n" //
                        +"793,112,119,1,0,0,,2184,6184,ff,Siemens serial number Byte 3 to be coded in ASCII\n" //
                        +"793,104,111,1,0,0,,2184,6184,ff,Siemens serial number Byte 4 to be coded in ASCII\n" //
                        +"793,96,103,1,0,0,,2184,6184,ff,Siemens serial number Byte 5 to be coded in ASCII\n" //
                        +"793,88,95,1,0,0,,2184,6184,ff,Siemens serial number Byte 6 to be coded in ASCII\n" //
                        +"793,80,87,1,0,0,,2184,6184,ff,Siemens serial number Byte 7 to be coded in ASCII\n" //
                        +"793,72,79,1,0,0,,2184,6184,ff,Siemens serial number Byte 8 to be coded in ASCII\n" //
                        +"793,64,71,1,0,0,,2184,6184,ff,Siemens serial number Byte 9 to be coded in ASCII\n" //
                        +"793,24,39,1,0,0,Hz,223138,623138,ff,EPWM_Pilot_Frequency\n" //
                        +"793,24,31,1,0,0,,22F18E,62F18E,ff,VehicleManufacturerKitAssemblyPartNumber\n" //
                        +"793,31,31,1,0,0,,22FFF5,62FFF5,ff,DIDFFF5.Download_enable\n" //
                        +"793,30,30,1,0,0,,22FFF5,62FFF5,ff,DIDFFF5.Coupler_unlocked\n" //
                        +"793,29,29,1,0,0,,22FFF5,62FFF5,ff,DIDFFF5.DCDC_Alarm\n" //
                        +"793,32,39,1,0,0,Hz,22FFF5,62FFF5,ff,DIDFFF5.MainsFrequency\n" //
                        +"793,40,47,1,0,0,A,22FFF5,62FFF5,ff,DIDFFF5.Input_Current_offset\n" //
                        +"793,48,55,1,0,0,A,22FFF5,62FFF5,ff,DIDFFF5.Set_Output_Max_Current\n" //
                        +"793,56,65,.0049,0,0,V,22FFF5,62FFF5,ff,DIDFFF5.NTC4_PCB\n" //
                        +"793,72,81,.0049,0,0,V,22FFF5,62FFF5,ff,DIDFFF5.NTC_PFC\n" //
                        +"793,88,97,.5,0,0,V,22FFF5,62FFF5,ff,DIDFFF5.Set_Output_Voltage\n" //
                        +"793,104,113,.5,0,0,V,22FFF5,62FFF5,ff,DIDFFF5.DC_Bus_Voltage\n" //
                        +"793,120,127,1,0,0,V,22FFF5,62FFF5,ff,DIDFFF5.5V_Supply_Pri\n" //
                        +"793,128,135,1,0,0,V,22FFF5,62FFF5,ff,DIDFFF5.12V_Supply_Pri\n" //
                        +"793,30,39,.5,0,0,V,22FFF4,62FFF4,ff,DIDFFF4.HV Battery_monitoring\n" //
                        +"793,25,25,1,0,0,,22FFF4,62FFF4,ff,DIDFFF4.Output_DCDC_Overvoltage_Alarm\n" //
                        +"793,24,24,1,0,0,,22FFF4,62FFF4,ff,DIDFFF4.Output_Overcurrent_Alarm\n" //
                        +"793,27,27,1,0,0,,22FFF4,62FFF4,ff,DIDFFF4.Overlock_Status\n" //
                        +"793,26,26,1,0,0,,22FFF4,62FFF4,ff,DIDFFF4.Secondary_Hardware_Alarm\n" //
                        +"793,40,47,.1,0,0,dV,22FFF4,62FFF4,ff,DIDFFF4.12V_Supply\n" //
                        +"793,48,55,.1,0,0,dV,22FFF4,62FFF4,ff,DIDFFF4.5V_Supply\n" //
                        +"793,81,90,.0049,0,0,Vdc,22FFF4,62FFF4,ff,DIDFFF4.Feedback_current_consign\n" //
                        +"793,97,106,.0049,0,0,Vdc,22FFF4,62FFF4,ff,DIDFFF4.Feedback_voltage_consign\n" //
                        +"793,56,63,1,0,0,dAdc,22FFF4,62FFF4,ff,DIDFFF4.Output_Current_DCDC\n" //
                        +"793,65,74,.5,0,0,Vdc,22FFF4,62FFF4,ff,DIDFFF4.Output_Voltage_DCDC\n" //
                        +"793,40,55,1,0,0,,22FFF2,62FFF2,ff,DIDFFF2.14VBatteryVoltage\n" //
                        +"793,56,71,1,0,0,,22FFF2,62FFF2,ff,DIDFFF2.14VBatteryVoltageSwitched\n" //
                        +"793,72,87,1,0,0,,22FFF2,62FFF2,ff,DIDFFF2.PowerPlantCurrentConsumption\n" //
                        +"793,88,103,1,0,0,,22FFF2,62FFF2,ff,DIDFFF2.NTC1_PCB\n" //
                        +"793,104,119,1,0,0,,22FFF2,62FFF2,ff,DIDFFF2.NTC2_PCB\n" //
                        +"793,120,135,1,0,0,,22FFF2,62FFF2,ff,DIDFFF2.NTC3_PCB\n" //
                        +"793,136,151,1,0,0,,22FFF2,62FFF2,ff,DIDFFF2.PILOT_J1772\n" //
                        +"793,152,167,1,0,0,,22FFF2,62FFF2,ff,DIDFFF2.NTC_Coolplate\n" //
                        +"793,168,183,1,0,0,,22FFF2,62FFF2,ff,DIDFFF2.VCC\n" //
                        +"793,184,199,1,0,0,,22FFF2,62FFF2,ff,DIDFFF2.VCC_SW\n" //
                        +"793,200,215,1,0,0,,22FFF2,62FFF2,ff,DIDFFF2.Ea_NCH_DET_LOGIC\n" //
                        +"793,216,231,1,0,0,,22FFF2,62FFF2,ff,DIDFFF2.Ea_RSA_NCH_DET_LOGIC\n" //
                        +"793,232,247,1,0,0,,22FFF2,62FFF2,ff,DIDFFF2.EDIAG_LED_Ilimit\n" //
                        +"793,31,31,1,0,0,,22FFF3,62FFF3,ff,DIDFFF3.CTRL_14V_Switched\n" //
                        +"793,30,30,1,0,0,,22FFF3,62FFF3,ff,DIDFFF3.CTRL_CAN1_STB\n" //
                        +"793,29,29,1,0,0,,22FFF3,62FFF3,ff,DIDFFF3.CTRL_5V_SW_Enable\n" //
                        +"793,28,28,1,0,0,,22FFF3,62FFF3,ff,DIDFFF3.CTRL_EN_PWSupply\n" //
                        +"793,27,27,1,0,0,,22FFF3,62FFF3,ff,DIDFFF3.Download_CTRL\n" //
                        +"793,26,26,1,0,0,,22FFF3,62FFF3,ff,DIDFFF3.CTRL_RELAY_SWBOX_L1\n" //
                        +"793,25,25,1,0,0,,22FFF3,62FFF3,ff,DIDFFF3.CTRL_RELAY_SWBOX_L2\n" //
                        +"793,24,24,1,0,0,,22FFF3,62FFF3,ff,DIDFFF3.CTRL_RELAY_DCDC_P\n" //
                        +"793,39,39,1,0,0,,22FFF3,62FFF3,ff,DIDFFF3.EN_INH_KLine\n" //
                        +"793,37,37,1,0,0,,22FFF3,62FFF3,ff,DIDFFF3.CTRL_WAKEUP_SYS\n" //
                        +"793,35,35,1,0,0,,22FFF3,62FFF3,ff,DIDFFF3.DIAG_OT_Relay_SWBox_L1\n" //
                        +"793,34,34,1,0,0,,22FFF3,62FFF3,ff,DIDFFF3.DIAG_OT_Relay_SWBox_L2\n" //
                        +"793,33,33,1,0,0,,22FFF3,62FFF3,ff,DIDFFF3.DIAG_OT_Relay_DCDC_P\n" //
                        +"793,24,31,1,0,0,,22FF01,62FF01,ff,DIDFF01.AlarmIndex\n" //
                        +"793,32,39,1,0,0,,22FF01,62FF01,ff,DIDFF01.AlarmCode0\n" //
                        +"793,40,47,1,0,0,,22FF01,62FF01,ff,DIDFF01.AlarmCode1\n" //
                        +"793,48,55,1,0,0,,22FF01,62FF01,ff,DIDFF01.AlarmCode2\n" //
                        +"793,56,63,1,0,0,,22FF01,62FF01,ff,DIDFF01.AlarmCode3\n" //
                        +"793,64,71,1,0,0,,22FF01,62FF01,ff,DIDFF01.AlarmCode4\n" //
                        +"793,72,79,1,0,0,,22FF01,62FF01,ff,DIDFF01.AlarmCode5\n" //
                        +"793,80,87,1,0,0,,22FF01,62FF01,ff,DIDFF01.AlarmCode6\n" //
                        +"793,88,95,1,0,0,,22FF01,62FF01,ff,DIDFF01.AlarmCode7\n" //
                        +"793,96,103,1,0,0,,22FF01,62FF01,ff,DIDFF01.AlarmCode8\n" //
                        +"793,104,111,1,0,0,,22FF01,62FF01,ff,DIDFF01.AlarmCode9\n" //
                        +"793,24,24,1,0,0,,22FFF8,62FFF8,ff,DIDFFF8.Sup_SFY_Tx_Disp\n" //
                        +"793,25,25,1,0,0,,22FFF8,62FFF8,ff,DIDFFF8.Sup_SFY_Tx_RecMn\n" //
                        +"793,26,26,1,0,0,,22FFF8,62FFF8,ff,DIDFFF8.Sup_SFY_Tx_PSupp\n" //
                        +"793,27,27,1,0,0,,22FFF8,62FFF8,ff,DIDFFF8.Sup_SFY_Tx_RAM_Ch\n" //
                        +"793,32,32,1,0,0,,22FFF8,62FFF8,ff,DIDFFF8.PPP_SFY_Rx_Dispat\n" //
                        +"793,33,33,1,0,0,,22FFF8,62FFF8,ff,DIDFFF8.PPP_SFY_Rx_RecM\n" //
                        +"793,34,34,1,0,0,,22FFF8,62FFF8,ff,DIDFFF8.PPP_SFY_Rx_PSupp\n" //
                        +"793,35,35,1,0,0,,22FFF8,62FFF8,ff,DIDFFF8.PPP_SFY_Rx_PSecMn\n" //
                        +"793,36,36,1,0,0,,22FFF8,62FFF8,ff,DIDFFF8.SFY_Rx_RAM_Ch\n" //
                ;

        Frames.getInstance().load ("764,0,0,CLIM\n");
        Fields.getInstance().load (fieldDefBcb);
        Fields.getInstance().load (fieldDefJb2);
    }
}