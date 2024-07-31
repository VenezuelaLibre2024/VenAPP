.class public final enum Lm4/c$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm4/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lm4/c$b;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lm4/c$b;

.field public static final enum DESCRIPTION:Lm4/c$b;

.field public static final enum HINT:Lm4/c$b;

.field public static final enum ID:Lm4/c$b;

.field public static final enum TAG:Lm4/c$b;

.field public static final enum TEXT:Lm4/c$b;


# instance fields
.field private final value:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lm4/c$b;

    const-string v1, "ID"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lm4/c$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lm4/c$b;->ID:Lm4/c$b;

    new-instance v0, Lm4/c$b;

    const-string v1, "TEXT"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v3, v2}, Lm4/c$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lm4/c$b;->TEXT:Lm4/c$b;

    new-instance v0, Lm4/c$b;

    const-string v1, "TAG"

    const/4 v3, 0x4

    invoke-direct {v0, v1, v2, v3}, Lm4/c$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lm4/c$b;->TAG:Lm4/c$b;

    new-instance v0, Lm4/c$b;

    const/4 v1, 0x3

    const/16 v2, 0x8

    const-string v4, "DESCRIPTION"

    invoke-direct {v0, v4, v1, v2}, Lm4/c$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lm4/c$b;->DESCRIPTION:Lm4/c$b;

    new-instance v0, Lm4/c$b;

    const-string v1, "HINT"

    const/16 v2, 0x10

    invoke-direct {v0, v1, v3, v2}, Lm4/c$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lm4/c$b;->HINT:Lm4/c$b;

    invoke-static {}, Lm4/c$b;->b()[Lm4/c$b;

    move-result-object v0

    sput-object v0, Lm4/c$b;->$VALUES:[Lm4/c$b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lm4/c$b;->value:I

    return-void
.end method

.method private static final synthetic b()[Lm4/c$b;
    .locals 3

    const/4 v0, 0x5

    new-array v0, v0, [Lm4/c$b;

    const/4 v1, 0x0

    sget-object v2, Lm4/c$b;->ID:Lm4/c$b;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lm4/c$b;->TEXT:Lm4/c$b;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lm4/c$b;->TAG:Lm4/c$b;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lm4/c$b;->DESCRIPTION:Lm4/c$b;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lm4/c$b;->HINT:Lm4/c$b;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lm4/c$b;
    .locals 1

    const-string v0, "value"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, Lm4/c$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lm4/c$b;

    return-object p0
.end method

.method public static values()[Lm4/c$b;
    .locals 2

    sget-object v0, Lm4/c$b;->$VALUES:[Lm4/c$b;

    array-length v1, v0

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lm4/c$b;

    return-object v0
.end method


# virtual methods
.method public final h()I
    .locals 1

    iget v0, p0, Lm4/c$b;->value:I

    return v0
.end method
