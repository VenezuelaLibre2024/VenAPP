.class public final enum Lqa/b0;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lqa/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lqa/b0;",
        ">;",
        "Lqa/a;"
    }
.end annotation


# static fields
.field public static final enum LEGACY_RS1:Lqa/b0;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final enum PS256:Lqa/b0;

.field public static final enum PS384:Lqa/b0;

.field public static final enum PS512:Lqa/b0;

.field public static final enum RS1:Lqa/b0;

.field public static final enum RS256:Lqa/b0;

.field public static final enum RS384:Lqa/b0;

.field public static final enum RS512:Lqa/b0;

.field private static final synthetic zza:[Lqa/b0;


# instance fields
.field private final zzb:I


# direct methods
.method static constructor <clinit>()V
    .locals 16

    new-instance v0, Lqa/b0;

    const/16 v1, -0x101

    const-string v2, "RS256"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, Lqa/b0;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lqa/b0;->RS256:Lqa/b0;

    new-instance v1, Lqa/b0;

    const/16 v2, -0x102

    const-string v4, "RS384"

    const/4 v5, 0x1

    invoke-direct {v1, v4, v5, v2}, Lqa/b0;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lqa/b0;->RS384:Lqa/b0;

    new-instance v2, Lqa/b0;

    const/16 v4, -0x103

    const-string v6, "RS512"

    const/4 v7, 0x2

    invoke-direct {v2, v6, v7, v4}, Lqa/b0;-><init>(Ljava/lang/String;II)V

    sput-object v2, Lqa/b0;->RS512:Lqa/b0;

    new-instance v4, Lqa/b0;

    const/16 v6, -0x106

    const-string v8, "LEGACY_RS1"

    const/4 v9, 0x3

    invoke-direct {v4, v8, v9, v6}, Lqa/b0;-><init>(Ljava/lang/String;II)V

    sput-object v4, Lqa/b0;->LEGACY_RS1:Lqa/b0;

    new-instance v6, Lqa/b0;

    const/16 v8, -0x25

    const-string v10, "PS256"

    const/4 v11, 0x4

    invoke-direct {v6, v10, v11, v8}, Lqa/b0;-><init>(Ljava/lang/String;II)V

    sput-object v6, Lqa/b0;->PS256:Lqa/b0;

    new-instance v8, Lqa/b0;

    const/16 v10, -0x26

    const-string v12, "PS384"

    const/4 v13, 0x5

    invoke-direct {v8, v12, v13, v10}, Lqa/b0;-><init>(Ljava/lang/String;II)V

    sput-object v8, Lqa/b0;->PS384:Lqa/b0;

    new-instance v10, Lqa/b0;

    const/16 v12, -0x27

    const-string v14, "PS512"

    const/4 v15, 0x6

    invoke-direct {v10, v14, v15, v12}, Lqa/b0;-><init>(Ljava/lang/String;II)V

    sput-object v10, Lqa/b0;->PS512:Lqa/b0;

    new-instance v12, Lqa/b0;

    const v14, -0xffff

    const-string v15, "RS1"

    const/4 v13, 0x7

    invoke-direct {v12, v15, v13, v14}, Lqa/b0;-><init>(Ljava/lang/String;II)V

    sput-object v12, Lqa/b0;->RS1:Lqa/b0;

    const/16 v14, 0x8

    new-array v14, v14, [Lqa/b0;

    aput-object v0, v14, v3

    aput-object v1, v14, v5

    aput-object v2, v14, v7

    aput-object v4, v14, v9

    aput-object v6, v14, v11

    const/4 v0, 0x5

    aput-object v8, v14, v0

    const/4 v0, 0x6

    aput-object v10, v14, v0

    aput-object v12, v14, v13

    sput-object v14, Lqa/b0;->zza:[Lqa/b0;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lqa/b0;->zzb:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lqa/b0;
    .locals 1

    const-class v0, Lqa/b0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lqa/b0;

    return-object p0
.end method

.method public static values()[Lqa/b0;
    .locals 1

    sget-object v0, Lqa/b0;->zza:[Lqa/b0;

    invoke-virtual {v0}, [Lqa/b0;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lqa/b0;

    return-object v0
.end method


# virtual methods
.method public b()I
    .locals 1

    iget v0, p0, Lqa/b0;->zzb:I

    return v0
.end method
