.class final enum Lio/flutter/plugins/googlemobileads/FlutterAdapterStatus$AdapterInitializationState;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/plugins/googlemobileads/FlutterAdapterStatus;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4018
    name = "AdapterInitializationState"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/flutter/plugins/googlemobileads/FlutterAdapterStatus$AdapterInitializationState;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lio/flutter/plugins/googlemobileads/FlutterAdapterStatus$AdapterInitializationState;

.field public static final enum NOT_READY:Lio/flutter/plugins/googlemobileads/FlutterAdapterStatus$AdapterInitializationState;

.field public static final enum READY:Lio/flutter/plugins/googlemobileads/FlutterAdapterStatus$AdapterInitializationState;


# direct methods
.method private static synthetic $values()[Lio/flutter/plugins/googlemobileads/FlutterAdapterStatus$AdapterInitializationState;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Lio/flutter/plugins/googlemobileads/FlutterAdapterStatus$AdapterInitializationState;

    const/4 v1, 0x0

    sget-object v2, Lio/flutter/plugins/googlemobileads/FlutterAdapterStatus$AdapterInitializationState;->NOT_READY:Lio/flutter/plugins/googlemobileads/FlutterAdapterStatus$AdapterInitializationState;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lio/flutter/plugins/googlemobileads/FlutterAdapterStatus$AdapterInitializationState;->READY:Lio/flutter/plugins/googlemobileads/FlutterAdapterStatus$AdapterInitializationState;

    aput-object v2, v0, v1

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lio/flutter/plugins/googlemobileads/FlutterAdapterStatus$AdapterInitializationState;

    const-string v1, "NOT_READY"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lio/flutter/plugins/googlemobileads/FlutterAdapterStatus$AdapterInitializationState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/flutter/plugins/googlemobileads/FlutterAdapterStatus$AdapterInitializationState;->NOT_READY:Lio/flutter/plugins/googlemobileads/FlutterAdapterStatus$AdapterInitializationState;

    new-instance v0, Lio/flutter/plugins/googlemobileads/FlutterAdapterStatus$AdapterInitializationState;

    const-string v1, "READY"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lio/flutter/plugins/googlemobileads/FlutterAdapterStatus$AdapterInitializationState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/flutter/plugins/googlemobileads/FlutterAdapterStatus$AdapterInitializationState;->READY:Lio/flutter/plugins/googlemobileads/FlutterAdapterStatus$AdapterInitializationState;

    invoke-static {}, Lio/flutter/plugins/googlemobileads/FlutterAdapterStatus$AdapterInitializationState;->$values()[Lio/flutter/plugins/googlemobileads/FlutterAdapterStatus$AdapterInitializationState;

    move-result-object v0

    sput-object v0, Lio/flutter/plugins/googlemobileads/FlutterAdapterStatus$AdapterInitializationState;->$VALUES:[Lio/flutter/plugins/googlemobileads/FlutterAdapterStatus$AdapterInitializationState;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lio/flutter/plugins/googlemobileads/FlutterAdapterStatus$AdapterInitializationState;
    .locals 1

    const-class v0, Lio/flutter/plugins/googlemobileads/FlutterAdapterStatus$AdapterInitializationState;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/flutter/plugins/googlemobileads/FlutterAdapterStatus$AdapterInitializationState;

    return-object p0
.end method

.method public static values()[Lio/flutter/plugins/googlemobileads/FlutterAdapterStatus$AdapterInitializationState;
    .locals 1

    sget-object v0, Lio/flutter/plugins/googlemobileads/FlutterAdapterStatus$AdapterInitializationState;->$VALUES:[Lio/flutter/plugins/googlemobileads/FlutterAdapterStatus$AdapterInitializationState;

    invoke-virtual {v0}, [Lio/flutter/plugins/googlemobileads/FlutterAdapterStatus$AdapterInitializationState;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/flutter/plugins/googlemobileads/FlutterAdapterStatus$AdapterInitializationState;

    return-object v0
.end method
