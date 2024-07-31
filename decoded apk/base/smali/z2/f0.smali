.class public final enum Lz2/f0;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lz2/f0;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lz2/f0;

.field public static final enum disabled:Lz2/f0;

.field public static final enum enabled:Lz2/f0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lz2/f0;

    const-string v1, "disabled"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lz2/f0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lz2/f0;->disabled:Lz2/f0;

    new-instance v0, Lz2/f0;

    const-string v1, "enabled"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lz2/f0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lz2/f0;->enabled:Lz2/f0;

    invoke-static {}, Lz2/f0;->b()[Lz2/f0;

    move-result-object v0

    sput-object v0, Lz2/f0;->$VALUES:[Lz2/f0;

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

.method private static synthetic b()[Lz2/f0;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Lz2/f0;

    const/4 v1, 0x0

    sget-object v2, Lz2/f0;->disabled:Lz2/f0;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lz2/f0;->enabled:Lz2/f0;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lz2/f0;
    .locals 1

    const-class v0, Lz2/f0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lz2/f0;

    return-object p0
.end method

.method public static values()[Lz2/f0;
    .locals 1

    sget-object v0, Lz2/f0;->$VALUES:[Lz2/f0;

    invoke-virtual {v0}, [Lz2/f0;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lz2/f0;

    return-object v0
.end method
