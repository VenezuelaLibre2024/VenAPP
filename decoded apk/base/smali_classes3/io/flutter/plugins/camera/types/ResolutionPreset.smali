.class public final enum Lio/flutter/plugins/camera/types/ResolutionPreset;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/flutter/plugins/camera/types/ResolutionPreset;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lio/flutter/plugins/camera/types/ResolutionPreset;

.field public static final enum high:Lio/flutter/plugins/camera/types/ResolutionPreset;

.field public static final enum low:Lio/flutter/plugins/camera/types/ResolutionPreset;

.field public static final enum max:Lio/flutter/plugins/camera/types/ResolutionPreset;

.field public static final enum medium:Lio/flutter/plugins/camera/types/ResolutionPreset;

.field public static final enum ultraHigh:Lio/flutter/plugins/camera/types/ResolutionPreset;

.field public static final enum veryHigh:Lio/flutter/plugins/camera/types/ResolutionPreset;


# direct methods
.method private static synthetic $values()[Lio/flutter/plugins/camera/types/ResolutionPreset;
    .locals 3

    const/4 v0, 0x6

    new-array v0, v0, [Lio/flutter/plugins/camera/types/ResolutionPreset;

    const/4 v1, 0x0

    sget-object v2, Lio/flutter/plugins/camera/types/ResolutionPreset;->low:Lio/flutter/plugins/camera/types/ResolutionPreset;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lio/flutter/plugins/camera/types/ResolutionPreset;->medium:Lio/flutter/plugins/camera/types/ResolutionPreset;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lio/flutter/plugins/camera/types/ResolutionPreset;->high:Lio/flutter/plugins/camera/types/ResolutionPreset;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lio/flutter/plugins/camera/types/ResolutionPreset;->veryHigh:Lio/flutter/plugins/camera/types/ResolutionPreset;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lio/flutter/plugins/camera/types/ResolutionPreset;->ultraHigh:Lio/flutter/plugins/camera/types/ResolutionPreset;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lio/flutter/plugins/camera/types/ResolutionPreset;->max:Lio/flutter/plugins/camera/types/ResolutionPreset;

    aput-object v2, v0, v1

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lio/flutter/plugins/camera/types/ResolutionPreset;

    const-string v1, "low"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lio/flutter/plugins/camera/types/ResolutionPreset;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/flutter/plugins/camera/types/ResolutionPreset;->low:Lio/flutter/plugins/camera/types/ResolutionPreset;

    new-instance v0, Lio/flutter/plugins/camera/types/ResolutionPreset;

    const-string v1, "medium"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lio/flutter/plugins/camera/types/ResolutionPreset;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/flutter/plugins/camera/types/ResolutionPreset;->medium:Lio/flutter/plugins/camera/types/ResolutionPreset;

    new-instance v0, Lio/flutter/plugins/camera/types/ResolutionPreset;

    const-string v1, "high"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lio/flutter/plugins/camera/types/ResolutionPreset;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/flutter/plugins/camera/types/ResolutionPreset;->high:Lio/flutter/plugins/camera/types/ResolutionPreset;

    new-instance v0, Lio/flutter/plugins/camera/types/ResolutionPreset;

    const-string v1, "veryHigh"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lio/flutter/plugins/camera/types/ResolutionPreset;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/flutter/plugins/camera/types/ResolutionPreset;->veryHigh:Lio/flutter/plugins/camera/types/ResolutionPreset;

    new-instance v0, Lio/flutter/plugins/camera/types/ResolutionPreset;

    const-string v1, "ultraHigh"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lio/flutter/plugins/camera/types/ResolutionPreset;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/flutter/plugins/camera/types/ResolutionPreset;->ultraHigh:Lio/flutter/plugins/camera/types/ResolutionPreset;

    new-instance v0, Lio/flutter/plugins/camera/types/ResolutionPreset;

    const-string v1, "max"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lio/flutter/plugins/camera/types/ResolutionPreset;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/flutter/plugins/camera/types/ResolutionPreset;->max:Lio/flutter/plugins/camera/types/ResolutionPreset;

    invoke-static {}, Lio/flutter/plugins/camera/types/ResolutionPreset;->$values()[Lio/flutter/plugins/camera/types/ResolutionPreset;

    move-result-object v0

    sput-object v0, Lio/flutter/plugins/camera/types/ResolutionPreset;->$VALUES:[Lio/flutter/plugins/camera/types/ResolutionPreset;

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

.method public static valueOf(Ljava/lang/String;)Lio/flutter/plugins/camera/types/ResolutionPreset;
    .locals 1

    const-class v0, Lio/flutter/plugins/camera/types/ResolutionPreset;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/flutter/plugins/camera/types/ResolutionPreset;

    return-object p0
.end method

.method public static values()[Lio/flutter/plugins/camera/types/ResolutionPreset;
    .locals 1

    sget-object v0, Lio/flutter/plugins/camera/types/ResolutionPreset;->$VALUES:[Lio/flutter/plugins/camera/types/ResolutionPreset;

    invoke-virtual {v0}, [Lio/flutter/plugins/camera/types/ResolutionPreset;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/flutter/plugins/camera/types/ResolutionPreset;

    return-object v0
.end method
