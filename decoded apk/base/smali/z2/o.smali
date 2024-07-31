.class public final enum Lz2/o;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lz2/o;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lz2/o;

.field public static final enum precise:Lz2/o;

.field public static final enum reduced:Lz2/o;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lz2/o;

    const-string v1, "reduced"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lz2/o;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lz2/o;->reduced:Lz2/o;

    new-instance v0, Lz2/o;

    const-string v1, "precise"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lz2/o;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lz2/o;->precise:Lz2/o;

    invoke-static {}, Lz2/o;->b()[Lz2/o;

    move-result-object v0

    sput-object v0, Lz2/o;->$VALUES:[Lz2/o;

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

.method private static synthetic b()[Lz2/o;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Lz2/o;

    const/4 v1, 0x0

    sget-object v2, Lz2/o;->reduced:Lz2/o;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lz2/o;->precise:Lz2/o;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lz2/o;
    .locals 1

    const-class v0, Lz2/o;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lz2/o;

    return-object p0
.end method

.method public static values()[Lz2/o;
    .locals 1

    sget-object v0, Lz2/o;->$VALUES:[Lz2/o;

    invoke-virtual {v0}, [Lz2/o;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lz2/o;

    return-object v0
.end method
