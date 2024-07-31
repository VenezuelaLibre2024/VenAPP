package com.pichillilorenzo.flutter_inappwebview_android.proxy;

import com.pichillilorenzo.flutter_inappwebview_android.ISettings;
import com.pichillilorenzo.flutter_inappwebview_android.types.ProxyRuleExt;
import e2.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class ProxySettings implements ISettings<d> {
    List<String> bypassRules = new ArrayList();
    List<String> directs = new ArrayList();
    List<ProxyRuleExt> proxyRules = new ArrayList();
    Boolean bypassSimpleHostnames = null;
    Boolean removeImplicitRules = null;
    Boolean reverseBypassEnabled = Boolean.FALSE;

    @Override // com.pichillilorenzo.flutter_inappwebview_android.ISettings
    public Map<String, Object> getRealSettings(d dVar) {
        Map<String, Object> map = toMap();
        ArrayList arrayList = new ArrayList();
        for (d.b bVar : dVar.b()) {
            HashMap hashMap = new HashMap();
            hashMap.put("url", bVar.b());
            hashMap.put("schemeFilter", bVar.a());
            arrayList.add(hashMap);
        }
        map.put("bypassRules", dVar.a());
        map.put("proxyRules", arrayList);
        map.put("reverseBypassEnabled", Boolean.valueOf(dVar.c()));
        return map;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.ISettings
    public /* bridge */ /* synthetic */ ISettings<d> parse(Map map) {
        return parse2((Map<String, Object>) map);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0029. Please report as an issue. */
    @Override // com.pichillilorenzo.flutter_inappwebview_android.ISettings
    /* renamed from: parse, reason: avoid collision after fix types in other method */
    public ISettings<d> parse2(Map<String, Object> map) {
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                key.hashCode();
                char c10 = 65535;
                switch (key.hashCode()) {
                    case -2059288826:
                        if (key.equals("bypassSimpleHostnames")) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case -1872895191:
                        if (key.equals("proxyRules")) {
                            c10 = 1;
                            break;
                        }
                        break;
                    case -1033831049:
                        if (key.equals("reverseBypassEnabled")) {
                            c10 = 2;
                            break;
                        }
                        break;
                    case -940646418:
                        if (key.equals("removeImplicitRules")) {
                            c10 = 3;
                            break;
                        }
                        break;
                    case 1021951215:
                        if (key.equals("bypassRules")) {
                            c10 = 4;
                            break;
                        }
                        break;
                    case 1670504874:
                        if (key.equals("directs")) {
                            c10 = 5;
                            break;
                        }
                        break;
                }
                switch (c10) {
                    case 0:
                        this.bypassSimpleHostnames = (Boolean) value;
                        break;
                    case 1:
                        this.proxyRules = new ArrayList();
                        Iterator it = ((List) value).iterator();
                        while (it.hasNext()) {
                            ProxyRuleExt fromMap = ProxyRuleExt.fromMap((Map) it.next());
                            if (fromMap != null) {
                                this.proxyRules.add(fromMap);
                            }
                        }
                        break;
                    case 2:
                        this.reverseBypassEnabled = (Boolean) value;
                        break;
                    case 3:
                        this.removeImplicitRules = (Boolean) value;
                        break;
                    case 4:
                        this.bypassRules = (List) value;
                        break;
                    case 5:
                        this.directs = (List) value;
                        break;
                }
            }
        }
        return this;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.ISettings
    public Map<String, Object> toMap() {
        ArrayList arrayList = new ArrayList();
        Iterator<ProxyRuleExt> it = this.proxyRules.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().toMap());
        }
        HashMap hashMap = new HashMap();
        hashMap.put("bypassRules", this.bypassRules);
        hashMap.put("directs", this.directs);
        hashMap.put("proxyRules", arrayList);
        hashMap.put("bypassSimpleHostnames", this.bypassSimpleHostnames);
        hashMap.put("removeImplicitRules", this.removeImplicitRules);
        hashMap.put("reverseBypassEnabled", this.reverseBypassEnabled);
        return hashMap;
    }
}
