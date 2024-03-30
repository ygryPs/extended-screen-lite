package com.ygryps.extendedscreenlite

import android.accessibilityservice.AccessibilityService
import android.view.accessibility.AccessibilityEvent

class ScrollerService : AccessibilityService() {
    override fun onInterrupt() {}

    override fun onAccessibilityEvent(event: AccessibilityEvent?) {}
}
