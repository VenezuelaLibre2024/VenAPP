.class public final Lx7/i$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv7/v0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx7/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation


# instance fields
.field public final a:Lx7/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx7/i<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final b:Lv7/u0;

.field private final c:I

.field private d:Z

.field final synthetic e:Lx7/i;


# direct methods
.method public constructor <init>(Lx7/i;Lx7/i;Lv7/u0;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx7/i<",
            "TT;>;",
            "Lv7/u0;",
            "I)V"
        }
    .end annotation

    iput-object p1, p0, Lx7/i$a;->e:Lx7/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lx7/i$a;->a:Lx7/i;

    iput-object p3, p0, Lx7/i$a;->b:Lv7/u0;

    iput p4, p0, Lx7/i$a;->c:I

    return-void
.end method

.method private b()V
    .locals 8

    iget-boolean v0, p0, Lx7/i$a;->d:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lx7/i$a;->e:Lx7/i;

    invoke-static {v0}, Lx7/i;->z(Lx7/i;)Lv7/h0$a;

    move-result-object v1

    iget-object v0, p0, Lx7/i$a;->e:Lx7/i;

    invoke-static {v0}, Lx7/i;->w(Lx7/i;)[I

    move-result-object v0

    iget v2, p0, Lx7/i$a;->c:I

    aget v2, v0, v2

    iget-object v0, p0, Lx7/i$a;->e:Lx7/i;

    invoke-static {v0}, Lx7/i;->x(Lx7/i;)[Lt6/u1;

    move-result-object v0

    iget v3, p0, Lx7/i$a;->c:I

    aget-object v3, v0, v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    iget-object v0, p0, Lx7/i$a;->e:Lx7/i;

    invoke-static {v0}, Lx7/i;->y(Lx7/i;)J

    move-result-wide v6

    invoke-virtual/range {v1 .. v7}, Lv7/h0$a;->i(ILt6/u1;ILjava/lang/Object;J)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lx7/i$a;->d:Z

    :cond_0
    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public c()V
    .locals 3

    iget-object v0, p0, Lx7/i$a;->e:Lx7/i;

    invoke-static {v0}, Lx7/i;->v(Lx7/i;)[Z

    move-result-object v0

    iget v1, p0, Lx7/i$a;->c:I

    aget-boolean v0, v0, v1

    invoke-static {v0}, Lt8/a;->g(Z)V

    iget-object v0, p0, Lx7/i$a;->e:Lx7/i;

    invoke-static {v0}, Lx7/i;->v(Lx7/i;)[Z

    move-result-object v0

    iget v1, p0, Lx7/i$a;->c:I

    const/4 v2, 0x0

    aput-boolean v2, v0, v1

    return-void
.end method

.method public d()Z
    .locals 2

    iget-object v0, p0, Lx7/i$a;->e:Lx7/i;

    invoke-virtual {v0}, Lx7/i;->H()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lx7/i$a;->b:Lv7/u0;

    iget-object v1, p0, Lx7/i$a;->e:Lx7/i;

    iget-boolean v1, v1, Lx7/i;->H:Z

    invoke-virtual {v0, v1}, Lv7/u0;->K(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public p(J)I
    .locals 2

    iget-object v0, p0, Lx7/i$a;->e:Lx7/i;

    invoke-virtual {v0}, Lx7/i;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object v0, p0, Lx7/i$a;->b:Lv7/u0;

    iget-object v1, p0, Lx7/i$a;->e:Lx7/i;

    iget-boolean v1, v1, Lx7/i;->H:Z

    invoke-virtual {v0, p1, p2, v1}, Lv7/u0;->E(JZ)I

    move-result p1

    iget-object p2, p0, Lx7/i$a;->e:Lx7/i;

    invoke-static {p2}, Lx7/i;->u(Lx7/i;)Lx7/a;

    move-result-object p2

    if-eqz p2, :cond_1

    iget-object p2, p0, Lx7/i$a;->e:Lx7/i;

    invoke-static {p2}, Lx7/i;->u(Lx7/i;)Lx7/a;

    move-result-object p2

    iget v0, p0, Lx7/i$a;->c:I

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p2, v0}, Lx7/a;->i(I)I

    move-result p2

    iget-object v0, p0, Lx7/i$a;->b:Lv7/u0;

    invoke-virtual {v0}, Lv7/u0;->C()I

    move-result v0

    sub-int/2addr p2, v0

    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result p1

    :cond_1
    iget-object p2, p0, Lx7/i$a;->b:Lv7/u0;

    invoke-virtual {p2, p1}, Lv7/u0;->e0(I)V

    if-lez p1, :cond_2

    invoke-direct {p0}, Lx7/i$a;->b()V

    :cond_2
    return p1
.end method

.method public q(Lt6/v1;Lw6/g;I)I
    .locals 3

    iget-object v0, p0, Lx7/i$a;->e:Lx7/i;

    invoke-virtual {v0}, Lx7/i;->H()Z

    move-result v0

    const/4 v1, -0x3

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lx7/i$a;->e:Lx7/i;

    invoke-static {v0}, Lx7/i;->u(Lx7/i;)Lx7/a;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lx7/i$a;->e:Lx7/i;

    invoke-static {v0}, Lx7/i;->u(Lx7/i;)Lx7/a;

    move-result-object v0

    iget v2, p0, Lx7/i$a;->c:I

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {v0, v2}, Lx7/a;->i(I)I

    move-result v0

    iget-object v2, p0, Lx7/i$a;->b:Lv7/u0;

    invoke-virtual {v2}, Lv7/u0;->C()I

    move-result v2

    if-gt v0, v2, :cond_1

    return v1

    :cond_1
    invoke-direct {p0}, Lx7/i$a;->b()V

    iget-object v0, p0, Lx7/i$a;->b:Lv7/u0;

    iget-object v1, p0, Lx7/i$a;->e:Lx7/i;

    iget-boolean v1, v1, Lx7/i;->H:Z

    invoke-virtual {v0, p1, p2, p3, v1}, Lv7/u0;->S(Lt6/v1;Lw6/g;IZ)I

    move-result p1

    return p1
.end method
