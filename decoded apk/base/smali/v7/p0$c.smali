.class final Lv7/p0$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv7/v0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv7/p0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "c"
.end annotation


# instance fields
.field private final a:I

.field final synthetic b:Lv7/p0;


# direct methods
.method public constructor <init>(Lv7/p0;I)V
    .locals 0

    iput-object p1, p0, Lv7/p0$c;->b:Lv7/p0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lv7/p0$c;->a:I

    return-void
.end method

.method static synthetic b(Lv7/p0$c;)I
    .locals 0

    iget p0, p0, Lv7/p0$c;->a:I

    return p0
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lv7/p0$c;->b:Lv7/p0;

    iget v1, p0, Lv7/p0$c;->a:I

    invoke-virtual {v0, v1}, Lv7/p0;->X(I)V

    return-void
.end method

.method public d()Z
    .locals 2

    iget-object v0, p0, Lv7/p0$c;->b:Lv7/p0;

    iget v1, p0, Lv7/p0$c;->a:I

    invoke-virtual {v0, v1}, Lv7/p0;->P(I)Z

    move-result v0

    return v0
.end method

.method public p(J)I
    .locals 2

    iget-object v0, p0, Lv7/p0$c;->b:Lv7/p0;

    iget v1, p0, Lv7/p0$c;->a:I

    invoke-virtual {v0, v1, p1, p2}, Lv7/p0;->h0(IJ)I

    move-result p1

    return p1
.end method

.method public q(Lt6/v1;Lw6/g;I)I
    .locals 2

    iget-object v0, p0, Lv7/p0$c;->b:Lv7/p0;

    iget v1, p0, Lv7/p0$c;->a:I

    invoke-virtual {v0, v1, p1, p2, p3}, Lv7/p0;->d0(ILt6/v1;Lw6/g;I)I

    move-result p1

    return p1
.end method
