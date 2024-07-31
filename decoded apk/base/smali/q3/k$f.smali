.class Lq3/k$f;
.super Lq3/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq3/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "f"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lq3/k;-><init>()V

    return-void
.end method


# virtual methods
.method public a(IIII)Lq3/k$g;
    .locals 0

    sget-object p1, Lq3/k$g;->QUALITY:Lq3/k$g;

    return-object p1
.end method

.method public b(IIII)F
    .locals 0

    const/high16 p1, 0x3f800000    # 1.0f

    return p1
.end method
