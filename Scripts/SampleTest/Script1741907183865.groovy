import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

//Windows.startApplicationWithTitle('C:\\Users\\linh.nguyen\\Desktop\\counter_app\\build\\windows\\x64\\runner\\Release\\counter_app.exe', '')
def projectDir = RunConfiguration.getProjectDir()
Windows.startApplicationWithTitle(projectDir + "/Include/resources/counter_app.exe", '')

Windows.click(findWindowsObject('Object Repository/Button'))

Windows.click(findWindowsObject('Object Repository/Button(1)'))

Windows.closeApplication()

