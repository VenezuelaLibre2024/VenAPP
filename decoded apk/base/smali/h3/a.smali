.class public final enum Lh3/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lh3/a;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lh3/a;

.field public static final enum DATA_DISK_CACHE:Lh3/a;

.field public static final enum LOCAL:Lh3/a;

.field public static final enum MEMORY_CACHE:Lh3/a;

.field public static final enum REMOTE:Lh3/a;

.field public static final enum RESOURCE_DISK_CACHE:Lh3/a;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    new-instance v0, Lh3/a;

    const-string v1, "LOCAL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lh3/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lh3/a;->LOCAL:Lh3/a;

    new-instance v1, Lh3/a;

    const-string v3, "REMOTE"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lh3/a;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lh3/a;->REMOTE:Lh3/a;

    new-instance v3, Lh3/a;

    const-string v5, "DATA_DISK_CACHE"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lh3/a;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lh3/a;->DATA_DISK_CACHE:Lh3/a;

    new-instance v5, Lh3/a;

    const-string v7, "RESOURCE_DISK_CACHE"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lh3/a;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lh3/a;->RESOURCE_DISK_CACHE:Lh3/a;

    new-instance v7, Lh3/a;

    const-string v9, "MEMORY_CACHE"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10}, Lh3/a;-><init>(Ljava/lang/String;I)V

    sput-object v7, Lh3/a;->MEMORY_CACHE:Lh3/a;

    const/4 v9, 0x5

    new-array v9, v9, [Lh3/a;

    aput-object v0, v9, v2

    aput-object v1, v9, v4

    aput-object v3, v9, v6

    aput-object v5, v9, v8

    aput-object v7, v9, v10

    sput-object v9, Lh3/a;->$VALUES:[Lh3/a;

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

.method public static valueOf(Ljava/lang/String;)Lh3/a;
    .locals 1

    const-class v0, Lh3/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lh3/a;

    return-object p0
.end method

.method public static values()[Lh3/a;
    .locals 1

    sget-object v0, Lh3/a;->$VALUES:[Lh3/a;

    invoke-virtual {v0}, [Lh3/a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lh3/a;

    return-object v0
.end method