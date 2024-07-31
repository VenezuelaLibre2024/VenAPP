.class public final enum Lx8/y$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx8/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lx8/y$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum DEFAULT:Lx8/y$b;

.field public static final enum DISABLED:Lx8/y$b;

.field public static final enum ENABLED:Lx8/y$b;

.field private static final synthetic zza:[Lx8/y$b;


# instance fields
.field private final zzb:I


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lx8/y$b;

    const-string v1, "DEFAULT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lx8/y$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lx8/y$b;->DEFAULT:Lx8/y$b;

    new-instance v1, Lx8/y$b;

    const-string v3, "ENABLED"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, Lx8/y$b;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lx8/y$b;->ENABLED:Lx8/y$b;

    new-instance v3, Lx8/y$b;

    const-string v5, "DISABLED"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v6}, Lx8/y$b;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lx8/y$b;->DISABLED:Lx8/y$b;

    const/4 v5, 0x3

    new-array v5, v5, [Lx8/y$b;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    sput-object v5, Lx8/y$b;->zza:[Lx8/y$b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lx8/y$b;->zzb:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lx8/y$b;
    .locals 1

    const-class v0, Lx8/y$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lx8/y$b;

    return-object p0
.end method

.method public static values()[Lx8/y$b;
    .locals 1

    sget-object v0, Lx8/y$b;->zza:[Lx8/y$b;

    invoke-virtual {v0}, [Lx8/y$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lx8/y$b;

    return-object v0
.end method


# virtual methods
.method public b()I
    .locals 1

    iget v0, p0, Lx8/y$b;->zzb:I

    return v0
.end method
