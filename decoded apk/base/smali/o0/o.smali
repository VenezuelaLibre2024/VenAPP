.class public Lo0/o;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo0/o$a;
    }
.end annotation


# static fields
.field static g:I


# instance fields
.field a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ln0/e;",
            ">;"
        }
    .end annotation
.end field

.field b:I

.field c:Z

.field d:I

.field e:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lo0/o$a;",
            ">;"
        }
    .end annotation
.end field

.field private f:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo0/o;->a:Ljava/util/ArrayList;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lo0/o;->c:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lo0/o;->e:Ljava/util/ArrayList;

    const/4 v0, -0x1

    iput v0, p0, Lo0/o;->f:I

    sget v0, Lo0/o;->g:I

    add-int/lit8 v1, v0, 0x1

    sput v1, Lo0/o;->g:I

    iput v0, p0, Lo0/o;->b:I

    iput p1, p0, Lo0/o;->d:I

    return-void
.end method

.method private e()Ljava/lang/String;
    .locals 2

    iget v0, p0, Lo0/o;->d:I

    if-nez v0, :cond_0

    const-string v0, "Horizontal"

    return-object v0

    :cond_0
    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    const-string v0, "Vertical"

    return-object v0

    :cond_1
    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    const-string v0, "Both"

    return-object v0

    :cond_2
    const-string v0, "Unknown"

    return-object v0
.end method

.method private j(Lk0/d;Ljava/util/ArrayList;I)I
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lk0/d;",
            "Ljava/util/ArrayList<",
            "Ln0/e;",
            ">;I)I"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln0/e;

    invoke-virtual {v1}, Ln0/e;->I()Ln0/e;

    move-result-object v1

    check-cast v1, Ln0/f;

    invoke-virtual {p1}, Lk0/d;->D()V

    invoke-virtual {v1, p1, v0}, Ln0/e;->g(Lk0/d;Z)V

    move v2, v0

    :goto_0
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v2, v3, :cond_0

    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ln0/e;

    invoke-virtual {v3, p1, v0}, Ln0/e;->g(Lk0/d;Z)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    if-nez p3, :cond_1

    iget v2, v1, Ln0/f;->W0:I

    if-lez v2, :cond_1

    invoke-static {v1, p1, p2, v0}, Ln0/b;->b(Ln0/f;Lk0/d;Ljava/util/ArrayList;I)V

    :cond_1
    const/4 v2, 0x1

    if-ne p3, v2, :cond_2

    iget v3, v1, Ln0/f;->X0:I

    if-lez v3, :cond_2

    invoke-static {v1, p1, p2, v2}, Ln0/b;->b(Ln0/f;Lk0/d;Ljava/util/ArrayList;I)V

    :cond_2
    :try_start_0
    invoke-virtual {p1}, Lk0/d;->z()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v2

    invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_1
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, Lo0/o;->e:Ljava/util/ArrayList;

    :goto_2
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v0, v2, :cond_3

    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ln0/e;

    new-instance v3, Lo0/o$a;

    invoke-direct {v3, p0, v2, p1, p3}, Lo0/o$a;-><init>(Lo0/o;Ln0/e;Lk0/d;I)V

    iget-object v2, p0, Lo0/o;->e:Ljava/util/ArrayList;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_3
    if-nez p3, :cond_4

    iget-object p2, v1, Ln0/e;->O:Ln0/d;

    invoke-virtual {p1, p2}, Lk0/d;->x(Ljava/lang/Object;)I

    move-result p2

    iget-object p3, v1, Ln0/e;->Q:Ln0/d;

    :goto_3
    invoke-virtual {p1, p3}, Lk0/d;->x(Ljava/lang/Object;)I

    move-result p3

    invoke-virtual {p1}, Lk0/d;->D()V

    sub-int/2addr p3, p2

    return p3

    :cond_4
    iget-object p2, v1, Ln0/e;->P:Ln0/d;

    invoke-virtual {p1, p2}, Lk0/d;->x(Ljava/lang/Object;)I

    move-result p2

    iget-object p3, v1, Ln0/e;->R:Ln0/d;

    goto :goto_3
.end method


# virtual methods
.method public a(Ln0/e;)Z
    .locals 1

    iget-object v0, p0, Lo0/o;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object v0, p0, Lo0/o;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 p1, 0x1

    return p1
.end method

.method public b(Ljava/util/ArrayList;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lo0/o;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lo0/o;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget v1, p0, Lo0/o;->f:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_1

    if-lez v0, :cond_1

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo0/o;

    iget v3, p0, Lo0/o;->f:I

    iget v4, v2, Lo0/o;->b:I

    if-ne v3, v4, :cond_0

    iget v3, p0, Lo0/o;->d:I

    invoke-virtual {p0, v3, v2}, Lo0/o;->g(ILo0/o;)V

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    if-nez v0, :cond_2

    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :cond_2
    return-void
.end method

.method public c()I
    .locals 1

    iget v0, p0, Lo0/o;->b:I

    return v0
.end method

.method public d()I
    .locals 1

    iget v0, p0, Lo0/o;->d:I

    return v0
.end method

.method public f(Lk0/d;I)I
    .locals 1

    iget-object v0, p0, Lo0/o;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object v0, p0, Lo0/o;->a:Ljava/util/ArrayList;

    invoke-direct {p0, p1, v0, p2}, Lo0/o;->j(Lk0/d;Ljava/util/ArrayList;I)I

    move-result p1

    return p1
.end method

.method public g(ILo0/o;)V
    .locals 3

    iget-object v0, p0, Lo0/o;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln0/e;

    invoke-virtual {p2, v1}, Lo0/o;->a(Ln0/e;)Z

    invoke-virtual {p2}, Lo0/o;->c()I

    move-result v2

    if-nez p1, :cond_0

    iput v2, v1, Ln0/e;->I0:I

    goto :goto_0

    :cond_0
    iput v2, v1, Ln0/e;->J0:I

    goto :goto_0

    :cond_1
    iget p1, p2, Lo0/o;->b:I

    iput p1, p0, Lo0/o;->f:I

    return-void
.end method

.method public h(Z)V
    .locals 0

    iput-boolean p1, p0, Lo0/o;->c:Z

    return-void
.end method

.method public i(I)V
    .locals 0

    iput p1, p0, Lo0/o;->d:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-direct {p0}, Lo0/o;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lo0/o;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "] <"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lo0/o;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ln0/e;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ln0/e;->r()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " >"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
