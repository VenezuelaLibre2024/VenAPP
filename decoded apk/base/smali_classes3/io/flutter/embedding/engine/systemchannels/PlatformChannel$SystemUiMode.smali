.class public final enum Lio/flutter/embedding/engine/systemchannels/PlatformChannel$SystemUiMode;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/embedding/engine/systemchannels/PlatformChannel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "SystemUiMode"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/flutter/embedding/engine/systemchannels/PlatformChannel$SystemUiMode;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lio/flutter/embedding/engine/systemchannels/PlatformChannel$SystemUiMode;

.field public static final enum EDGE_TO_EDGE:Lio/flutter/embedding/engine/systemchannels/PlatformChannel$SystemUiMode;

.field public static final enum IMMERSIVE:Lio/flutter/embedding/engine/systemchannels/PlatformChannel$SystemUiMode;

.field public static final enum IMMERSIVE_STICKY:Lio/flutter/embedding/engine/systemchannels/PlatformChannel$SystemUiMode;

.field public static final enum LEAN_BACK:Lio/flutter/embedding/engine/systemchannels/PlatformChannel$SystemUiMode;


# instance fields
.field private encodedName:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    new-instance v0, Lio/flutter/embedding/engine/systemchannels/PlatformChannel$SystemUiMode;

    const-string v1, "SystemUiMode.leanBack"

    const-string v2, "LEAN_BACK"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, Lio/flutter/embedding/engine/systemchannels/PlatformChannel$SystemUiMode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/flutter/embedding/engine/systemchannels/PlatformChannel$SystemUiMode;->LEAN_BACK:Lio/flutter/embedding/engine/systemchannels/PlatformChannel$SystemUiMode;

    new-instance v1, Lio/flutter/embedding/engine/systemchannels/PlatformChannel$SystemUiMode;

    const-string v2, "SystemUiMode.immersive"

    const-string v4, "IMMERSIVE"

    const/4 v5, 0x1

    invoke-direct {v1, v4, v5, v2}, Lio/flutter/embedding/engine/systemchannels/PlatformChannel$SystemUiMode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lio/flutter/embedding/engine/systemchannels/PlatformChannel$SystemUiMode;->IMMERSIVE:Lio/flutter/embedding/engine/systemchannels/PlatformChannel$SystemUiMode;

    new-instance v2, Lio/flutter/embedding/engine/systemchannels/PlatformChannel$SystemUiMode;

    const-string v4, "SystemUiMode.immersiveSticky"

    const-string v6, "IMMERSIVE_STICKY"

    const/4 v7, 0x2

    invoke-direct {v2, v6, v7, v4}, Lio/flutter/embedding/engine/systemchannels/PlatformChannel$SystemUiMode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v2, Lio/flutter/embedding/engine/systemchannels/PlatformChannel$SystemUiMode;->IMMERSIVE_STICKY:Lio/flutter/embedding/engine/systemchannels/PlatformChannel$SystemUiMode;

    new-instance v4, Lio/flutter/embedding/engine/systemchannels/PlatformChannel$SystemUiMode;

    const-string v6, "SystemUiMode.edgeToEdge"

    const-string v8, "EDGE_TO_EDGE"

    const/4 v9, 0x3

    invoke-direct {v4, v8, v9, v6}, Lio/flutter/embedding/engine/systemchannels/PlatformChannel$SystemUiMode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v4, Lio/flutter/embedding/engine/systemchannels/PlatformChannel$SystemUiMode;->EDGE_TO_EDGE:Lio/flutter/embedding/engine/systemchannels/PlatformChannel$SystemUiMode;

    const/4 v6, 0x4

    new-array v6, v6, [Lio/flutter/embedding/engine/systemchannels/PlatformChannel$SystemUiMode;

    aput-object v0, v6, v3

    aput-object v1, v6, v5

    aput-object v2, v6, v7

    aput-object v4, v6, v9

    sput-object v6, Lio/flutter/embedding/engine/systemchannels/PlatformChannel$SystemUiMode;->$VALUES:[Lio/flutter/embedding/engine/systemchannels/PlatformChannel$SystemUiMode;

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

    iput-object p3, p0, Lio/flutter/embedding/engine/systemchannels/PlatformChannel$SystemUiMode;->encodedName:Ljava/lang/String;

    return-void
.end method

.method static fromValue(Ljava/lang/String;)Lio/flutter/embedding/engine/systemchannels/PlatformChannel$SystemUiMode;
    .locals 5

    invoke-static {}, Lio/flutter/embedding/engine/systemchannels/PlatformChannel$SystemUiMode;->values()[Lio/flutter/embedding/engine/systemchannels/PlatformChannel$SystemUiMode;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    iget-object v4, v3, Lio/flutter/embedding/engine/systemchannels/PlatformChannel$SystemUiMode;->encodedName:Ljava/lang/String;

    invoke-virtual {v4, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/NoSuchFieldException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "No such SystemUiMode: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/NoSuchFieldException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static valueOf(Ljava/lang/String;)Lio/flutter/embedding/engine/systemchannels/PlatformChannel$SystemUiMode;
    .locals 1

    const-class v0, Lio/flutter/embedding/engine/systemchannels/PlatformChannel$SystemUiMode;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/flutter/embedding/engine/systemchannels/PlatformChannel$SystemUiMode;

    return-object p0
.end method

.method public static values()[Lio/flutter/embedding/engine/systemchannels/PlatformChannel$SystemUiMode;
    .locals 1

    sget-object v0, Lio/flutter/embedding/engine/systemchannels/PlatformChannel$SystemUiMode;->$VALUES:[Lio/flutter/embedding/engine/systemchannels/PlatformChannel$SystemUiMode;

    invoke-virtual {v0}, [Lio/flutter/embedding/engine/systemchannels/PlatformChannel$SystemUiMode;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/flutter/embedding/engine/systemchannels/PlatformChannel$SystemUiMode;

    return-object v0
.end method
