.class final enum Lio/flutter/plugins/camera/DartMessenger$CameraEventType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/plugins/camera/DartMessenger;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4018
    name = "CameraEventType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/flutter/plugins/camera/DartMessenger$CameraEventType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lio/flutter/plugins/camera/DartMessenger$CameraEventType;

.field public static final enum CLOSING:Lio/flutter/plugins/camera/DartMessenger$CameraEventType;

.field public static final enum ERROR:Lio/flutter/plugins/camera/DartMessenger$CameraEventType;

.field public static final enum INITIALIZED:Lio/flutter/plugins/camera/DartMessenger$CameraEventType;


# instance fields
.field final method:Ljava/lang/String;


# direct methods
.method private static synthetic $values()[Lio/flutter/plugins/camera/DartMessenger$CameraEventType;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Lio/flutter/plugins/camera/DartMessenger$CameraEventType;

    const/4 v1, 0x0

    sget-object v2, Lio/flutter/plugins/camera/DartMessenger$CameraEventType;->ERROR:Lio/flutter/plugins/camera/DartMessenger$CameraEventType;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lio/flutter/plugins/camera/DartMessenger$CameraEventType;->CLOSING:Lio/flutter/plugins/camera/DartMessenger$CameraEventType;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lio/flutter/plugins/camera/DartMessenger$CameraEventType;->INITIALIZED:Lio/flutter/plugins/camera/DartMessenger$CameraEventType;

    aput-object v2, v0, v1

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lio/flutter/plugins/camera/DartMessenger$CameraEventType;

    const/4 v1, 0x0

    const-string v2, "error"

    const-string v3, "ERROR"

    invoke-direct {v0, v3, v1, v2}, Lio/flutter/plugins/camera/DartMessenger$CameraEventType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/flutter/plugins/camera/DartMessenger$CameraEventType;->ERROR:Lio/flutter/plugins/camera/DartMessenger$CameraEventType;

    new-instance v0, Lio/flutter/plugins/camera/DartMessenger$CameraEventType;

    const/4 v1, 0x1

    const-string v2, "camera_closing"

    const-string v3, "CLOSING"

    invoke-direct {v0, v3, v1, v2}, Lio/flutter/plugins/camera/DartMessenger$CameraEventType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/flutter/plugins/camera/DartMessenger$CameraEventType;->CLOSING:Lio/flutter/plugins/camera/DartMessenger$CameraEventType;

    new-instance v0, Lio/flutter/plugins/camera/DartMessenger$CameraEventType;

    const/4 v1, 0x2

    const-string v2, "initialized"

    const-string v3, "INITIALIZED"

    invoke-direct {v0, v3, v1, v2}, Lio/flutter/plugins/camera/DartMessenger$CameraEventType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/flutter/plugins/camera/DartMessenger$CameraEventType;->INITIALIZED:Lio/flutter/plugins/camera/DartMessenger$CameraEventType;

    invoke-static {}, Lio/flutter/plugins/camera/DartMessenger$CameraEventType;->$values()[Lio/flutter/plugins/camera/DartMessenger$CameraEventType;

    move-result-object v0

    sput-object v0, Lio/flutter/plugins/camera/DartMessenger$CameraEventType;->$VALUES:[Lio/flutter/plugins/camera/DartMessenger$CameraEventType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lio/flutter/plugins/camera/DartMessenger$CameraEventType;->method:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lio/flutter/plugins/camera/DartMessenger$CameraEventType;
    .locals 1

    const-class v0, Lio/flutter/plugins/camera/DartMessenger$CameraEventType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/flutter/plugins/camera/DartMessenger$CameraEventType;

    return-object p0
.end method

.method public static values()[Lio/flutter/plugins/camera/DartMessenger$CameraEventType;
    .locals 1

    sget-object v0, Lio/flutter/plugins/camera/DartMessenger$CameraEventType;->$VALUES:[Lio/flutter/plugins/camera/DartMessenger$CameraEventType;

    invoke-virtual {v0}, [Lio/flutter/plugins/camera/DartMessenger$CameraEventType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/flutter/plugins/camera/DartMessenger$CameraEventType;

    return-object v0
.end method
