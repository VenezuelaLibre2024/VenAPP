.class public final enum Lq3/k$g;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq3/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "g"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lq3/k$g;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lq3/k$g;

.field public static final enum MEMORY:Lq3/k$g;

.field public static final enum QUALITY:Lq3/k$g;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lq3/k$g;

    const-string v1, "MEMORY"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lq3/k$g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lq3/k$g;->MEMORY:Lq3/k$g;

    new-instance v1, Lq3/k$g;

    const-string v3, "QUALITY"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lq3/k$g;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lq3/k$g;->QUALITY:Lq3/k$g;

    const/4 v3, 0x2

    new-array v3, v3, [Lq3/k$g;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    sput-object v3, Lq3/k$g;->$VALUES:[Lq3/k$g;

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

.method public static valueOf(Ljava/lang/String;)Lq3/k$g;
    .locals 1

    const-class v0, Lq3/k$g;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lq3/k$g;

    return-object p0
.end method

.method public static values()[Lq3/k$g;
    .locals 1

    sget-object v0, Lq3/k$g;->$VALUES:[Lq3/k$g;

    invoke-virtual {v0}, [Lq3/k$g;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lq3/k$g;

    return-object v0
.end method
