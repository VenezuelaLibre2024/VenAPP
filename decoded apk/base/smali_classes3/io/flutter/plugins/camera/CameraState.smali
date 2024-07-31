.class public final enum Lio/flutter/plugins/camera/CameraState;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/flutter/plugins/camera/CameraState;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lio/flutter/plugins/camera/CameraState;

.field public static final enum STATE_CAPTURING:Lio/flutter/plugins/camera/CameraState;

.field public static final enum STATE_PREVIEW:Lio/flutter/plugins/camera/CameraState;

.field public static final enum STATE_WAITING_FOCUS:Lio/flutter/plugins/camera/CameraState;

.field public static final enum STATE_WAITING_PRECAPTURE_DONE:Lio/flutter/plugins/camera/CameraState;

.field public static final enum STATE_WAITING_PRECAPTURE_START:Lio/flutter/plugins/camera/CameraState;


# direct methods
.method private static synthetic $values()[Lio/flutter/plugins/camera/CameraState;
    .locals 3

    const/4 v0, 0x5

    new-array v0, v0, [Lio/flutter/plugins/camera/CameraState;

    const/4 v1, 0x0

    sget-object v2, Lio/flutter/plugins/camera/CameraState;->STATE_PREVIEW:Lio/flutter/plugins/camera/CameraState;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lio/flutter/plugins/camera/CameraState;->STATE_WAITING_FOCUS:Lio/flutter/plugins/camera/CameraState;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lio/flutter/plugins/camera/CameraState;->STATE_WAITING_PRECAPTURE_START:Lio/flutter/plugins/camera/CameraState;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lio/flutter/plugins/camera/CameraState;->STATE_WAITING_PRECAPTURE_DONE:Lio/flutter/plugins/camera/CameraState;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lio/flutter/plugins/camera/CameraState;->STATE_CAPTURING:Lio/flutter/plugins/camera/CameraState;

    aput-object v2, v0, v1

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lio/flutter/plugins/camera/CameraState;

    const-string v1, "STATE_PREVIEW"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lio/flutter/plugins/camera/CameraState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/flutter/plugins/camera/CameraState;->STATE_PREVIEW:Lio/flutter/plugins/camera/CameraState;

    new-instance v0, Lio/flutter/plugins/camera/CameraState;

    const-string v1, "STATE_WAITING_FOCUS"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lio/flutter/plugins/camera/CameraState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/flutter/plugins/camera/CameraState;->STATE_WAITING_FOCUS:Lio/flutter/plugins/camera/CameraState;

    new-instance v0, Lio/flutter/plugins/camera/CameraState;

    const-string v1, "STATE_WAITING_PRECAPTURE_START"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lio/flutter/plugins/camera/CameraState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/flutter/plugins/camera/CameraState;->STATE_WAITING_PRECAPTURE_START:Lio/flutter/plugins/camera/CameraState;

    new-instance v0, Lio/flutter/plugins/camera/CameraState;

    const-string v1, "STATE_WAITING_PRECAPTURE_DONE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lio/flutter/plugins/camera/CameraState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/flutter/plugins/camera/CameraState;->STATE_WAITING_PRECAPTURE_DONE:Lio/flutter/plugins/camera/CameraState;

    new-instance v0, Lio/flutter/plugins/camera/CameraState;

    const-string v1, "STATE_CAPTURING"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lio/flutter/plugins/camera/CameraState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/flutter/plugins/camera/CameraState;->STATE_CAPTURING:Lio/flutter/plugins/camera/CameraState;

    invoke-static {}, Lio/flutter/plugins/camera/CameraState;->$values()[Lio/flutter/plugins/camera/CameraState;

    move-result-object v0

    sput-object v0, Lio/flutter/plugins/camera/CameraState;->$VALUES:[Lio/flutter/plugins/camera/CameraState;

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

.method public static valueOf(Ljava/lang/String;)Lio/flutter/plugins/camera/CameraState;
    .locals 1

    const-class v0, Lio/flutter/plugins/camera/CameraState;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/flutter/plugins/camera/CameraState;

    return-object p0
.end method

.method public static values()[Lio/flutter/plugins/camera/CameraState;
    .locals 1

    sget-object v0, Lio/flutter/plugins/camera/CameraState;->$VALUES:[Lio/flutter/plugins/camera/CameraState;

    invoke-virtual {v0}, [Lio/flutter/plugins/camera/CameraState;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/flutter/plugins/camera/CameraState;

    return-object v0
.end method
