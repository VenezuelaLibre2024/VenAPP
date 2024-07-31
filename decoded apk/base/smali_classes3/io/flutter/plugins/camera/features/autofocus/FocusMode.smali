.class public final enum Lio/flutter/plugins/camera/features/autofocus/FocusMode;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/flutter/plugins/camera/features/autofocus/FocusMode;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lio/flutter/plugins/camera/features/autofocus/FocusMode;

.field public static final enum auto:Lio/flutter/plugins/camera/features/autofocus/FocusMode;

.field public static final enum locked:Lio/flutter/plugins/camera/features/autofocus/FocusMode;


# instance fields
.field private final strValue:Ljava/lang/String;


# direct methods
.method private static synthetic $values()[Lio/flutter/plugins/camera/features/autofocus/FocusMode;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Lio/flutter/plugins/camera/features/autofocus/FocusMode;

    const/4 v1, 0x0

    sget-object v2, Lio/flutter/plugins/camera/features/autofocus/FocusMode;->auto:Lio/flutter/plugins/camera/features/autofocus/FocusMode;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lio/flutter/plugins/camera/features/autofocus/FocusMode;->locked:Lio/flutter/plugins/camera/features/autofocus/FocusMode;

    aput-object v2, v0, v1

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lio/flutter/plugins/camera/features/autofocus/FocusMode;

    const-string v1, "auto"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v1}, Lio/flutter/plugins/camera/features/autofocus/FocusMode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/flutter/plugins/camera/features/autofocus/FocusMode;->auto:Lio/flutter/plugins/camera/features/autofocus/FocusMode;

    new-instance v0, Lio/flutter/plugins/camera/features/autofocus/FocusMode;

    const-string v1, "locked"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, Lio/flutter/plugins/camera/features/autofocus/FocusMode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/flutter/plugins/camera/features/autofocus/FocusMode;->locked:Lio/flutter/plugins/camera/features/autofocus/FocusMode;

    invoke-static {}, Lio/flutter/plugins/camera/features/autofocus/FocusMode;->$values()[Lio/flutter/plugins/camera/features/autofocus/FocusMode;

    move-result-object v0

    sput-object v0, Lio/flutter/plugins/camera/features/autofocus/FocusMode;->$VALUES:[Lio/flutter/plugins/camera/features/autofocus/FocusMode;

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

    iput-object p3, p0, Lio/flutter/plugins/camera/features/autofocus/FocusMode;->strValue:Ljava/lang/String;

    return-void
.end method

.method public static getValueForString(Ljava/lang/String;)Lio/flutter/plugins/camera/features/autofocus/FocusMode;
    .locals 5

    invoke-static {}, Lio/flutter/plugins/camera/features/autofocus/FocusMode;->values()[Lio/flutter/plugins/camera/features/autofocus/FocusMode;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    iget-object v4, v3, Lio/flutter/plugins/camera/features/autofocus/FocusMode;->strValue:Ljava/lang/String;

    invoke-virtual {v4, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lio/flutter/plugins/camera/features/autofocus/FocusMode;
    .locals 1

    const-class v0, Lio/flutter/plugins/camera/features/autofocus/FocusMode;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/flutter/plugins/camera/features/autofocus/FocusMode;

    return-object p0
.end method

.method public static values()[Lio/flutter/plugins/camera/features/autofocus/FocusMode;
    .locals 1

    sget-object v0, Lio/flutter/plugins/camera/features/autofocus/FocusMode;->$VALUES:[Lio/flutter/plugins/camera/features/autofocus/FocusMode;

    invoke-virtual {v0}, [Lio/flutter/plugins/camera/features/autofocus/FocusMode;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/flutter/plugins/camera/features/autofocus/FocusMode;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/camera/features/autofocus/FocusMode;->strValue:Ljava/lang/String;

    return-object v0
.end method
