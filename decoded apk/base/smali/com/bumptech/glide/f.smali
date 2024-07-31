.class public final enum Lcom/bumptech/glide/f;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/bumptech/glide/f;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/bumptech/glide/f;

.field public static final enum HIGH:Lcom/bumptech/glide/f;

.field public static final enum LOW:Lcom/bumptech/glide/f;

.field public static final enum NORMAL:Lcom/bumptech/glide/f;


# instance fields
.field private final multiplier:F


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lcom/bumptech/glide/f;

    const/high16 v1, 0x3f000000    # 0.5f

    const-string v2, "LOW"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, Lcom/bumptech/glide/f;-><init>(Ljava/lang/String;IF)V

    sput-object v0, Lcom/bumptech/glide/f;->LOW:Lcom/bumptech/glide/f;

    new-instance v1, Lcom/bumptech/glide/f;

    const/high16 v2, 0x3f800000    # 1.0f

    const-string v4, "NORMAL"

    const/4 v5, 0x1

    invoke-direct {v1, v4, v5, v2}, Lcom/bumptech/glide/f;-><init>(Ljava/lang/String;IF)V

    sput-object v1, Lcom/bumptech/glide/f;->NORMAL:Lcom/bumptech/glide/f;

    new-instance v2, Lcom/bumptech/glide/f;

    const/high16 v4, 0x3fc00000    # 1.5f

    const-string v6, "HIGH"

    const/4 v7, 0x2

    invoke-direct {v2, v6, v7, v4}, Lcom/bumptech/glide/f;-><init>(Ljava/lang/String;IF)V

    sput-object v2, Lcom/bumptech/glide/f;->HIGH:Lcom/bumptech/glide/f;

    const/4 v4, 0x3

    new-array v4, v4, [Lcom/bumptech/glide/f;

    aput-object v0, v4, v3

    aput-object v1, v4, v5

    aput-object v2, v4, v7

    sput-object v4, Lcom/bumptech/glide/f;->$VALUES:[Lcom/bumptech/glide/f;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IF)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/bumptech/glide/f;->multiplier:F

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/bumptech/glide/f;
    .locals 1

    const-class v0, Lcom/bumptech/glide/f;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/bumptech/glide/f;

    return-object p0
.end method

.method public static values()[Lcom/bumptech/glide/f;
    .locals 1

    sget-object v0, Lcom/bumptech/glide/f;->$VALUES:[Lcom/bumptech/glide/f;

    invoke-virtual {v0}, [Lcom/bumptech/glide/f;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/bumptech/glide/f;

    return-object v0
.end method
