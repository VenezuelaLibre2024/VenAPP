.class public final enum Lqa/p;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lqa/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lqa/p;",
        ">;",
        "Lqa/a;"
    }
.end annotation


# static fields
.field public static final enum ED25519:Lqa/p;

.field public static final enum ED256:Lqa/p;

.field public static final enum ED512:Lqa/p;

.field public static final enum ES256:Lqa/p;

.field public static final enum ES384:Lqa/p;

.field public static final enum ES512:Lqa/p;

.field private static final synthetic zza:[Lqa/p;


# instance fields
.field private final zzb:I


# direct methods
.method static constructor <clinit>()V
    .locals 14

    new-instance v0, Lqa/p;

    const/16 v1, -0x104

    const-string v2, "ED256"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, Lqa/p;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lqa/p;->ED256:Lqa/p;

    new-instance v1, Lqa/p;

    const/16 v2, -0x105

    const-string v4, "ED512"

    const/4 v5, 0x1

    invoke-direct {v1, v4, v5, v2}, Lqa/p;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lqa/p;->ED512:Lqa/p;

    new-instance v2, Lqa/p;

    const/4 v4, -0x8

    const-string v6, "ED25519"

    const/4 v7, 0x2

    invoke-direct {v2, v6, v7, v4}, Lqa/p;-><init>(Ljava/lang/String;II)V

    sput-object v2, Lqa/p;->ED25519:Lqa/p;

    new-instance v4, Lqa/p;

    const/4 v6, -0x7

    const-string v8, "ES256"

    const/4 v9, 0x3

    invoke-direct {v4, v8, v9, v6}, Lqa/p;-><init>(Ljava/lang/String;II)V

    sput-object v4, Lqa/p;->ES256:Lqa/p;

    new-instance v6, Lqa/p;

    const/16 v8, -0x23

    const-string v10, "ES384"

    const/4 v11, 0x4

    invoke-direct {v6, v10, v11, v8}, Lqa/p;-><init>(Ljava/lang/String;II)V

    sput-object v6, Lqa/p;->ES384:Lqa/p;

    new-instance v8, Lqa/p;

    const/16 v10, -0x24

    const-string v12, "ES512"

    const/4 v13, 0x5

    invoke-direct {v8, v12, v13, v10}, Lqa/p;-><init>(Ljava/lang/String;II)V

    sput-object v8, Lqa/p;->ES512:Lqa/p;

    const/4 v10, 0x6

    new-array v10, v10, [Lqa/p;

    aput-object v0, v10, v3

    aput-object v1, v10, v5

    aput-object v2, v10, v7

    aput-object v4, v10, v9

    aput-object v6, v10, v11

    aput-object v8, v10, v13

    sput-object v10, Lqa/p;->zza:[Lqa/p;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lqa/p;->zzb:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lqa/p;
    .locals 1

    const-class v0, Lqa/p;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lqa/p;

    return-object p0
.end method

.method public static values()[Lqa/p;
    .locals 1

    sget-object v0, Lqa/p;->zza:[Lqa/p;

    invoke-virtual {v0}, [Lqa/p;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lqa/p;

    return-object v0
.end method


# virtual methods
.method public b()I
    .locals 1

    iget v0, p0, Lqa/p;->zzb:I

    return v0
.end method
