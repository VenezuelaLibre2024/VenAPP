.class final Lfh/f$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lfh/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lfh/f$c$a;
    }
.end annotation


# instance fields
.field private final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lfh/f$c$a;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Ldh/j;

.field final synthetic c:Lfh/f;


# direct methods
.method constructor <init>(Lfh/f;Ldh/j;Lfh/f$b;)V
    .locals 12

    iput-object p1, p0, Lfh/f$c;->c:Lfh/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lfh/f$c;->a:Ljava/util/List;

    const/4 v0, 0x0

    move v1, v0

    move v2, v1

    :goto_0
    const/4 v3, 0x1

    if-eqz p3, :cond_7

    invoke-static {p3}, Lfh/f$b;->a(Lfh/f$b;)I

    move-result v4

    add-int v10, v1, v4

    invoke-static {p3}, Lfh/f$b;->e(Lfh/f$b;)Lfh/f$b;

    move-result-object v1

    invoke-static {p3}, Lfh/f$b;->c(Lfh/f$b;)Ldh/h;

    move-result-object v4

    sget-object v5, Ldh/h;->BYTE:Ldh/h;

    if-ne v4, v5, :cond_0

    if-nez v1, :cond_0

    invoke-static {p3}, Lfh/f$b;->b(Lfh/f$b;)I

    move-result v4

    if-nez v4, :cond_1

    :cond_0
    if-eqz v1, :cond_2

    invoke-static {p3}, Lfh/f$b;->b(Lfh/f$b;)I

    move-result v4

    invoke-static {v1}, Lfh/f$b;->b(Lfh/f$b;)I

    move-result v5

    if-eq v4, v5, :cond_2

    :cond_1
    move v4, v3

    goto :goto_1

    :cond_2
    move v4, v0

    :goto_1
    if-eqz v4, :cond_3

    move v2, v3

    :cond_3
    if-eqz v1, :cond_4

    invoke-static {v1}, Lfh/f$b;->c(Lfh/f$b;)Ldh/h;

    move-result-object v3

    invoke-static {p3}, Lfh/f$b;->c(Lfh/f$b;)Ldh/h;

    move-result-object v5

    if-ne v3, v5, :cond_4

    if-eqz v4, :cond_5

    :cond_4
    iget-object v3, p0, Lfh/f$c;->a:Ljava/util/List;

    new-instance v11, Lfh/f$c$a;

    invoke-static {p3}, Lfh/f$b;->c(Lfh/f$b;)Ldh/h;

    move-result-object v7

    invoke-static {p3}, Lfh/f$b;->f(Lfh/f$b;)I

    move-result v8

    invoke-static {p3}, Lfh/f$b;->b(Lfh/f$b;)I

    move-result v9

    move-object v5, v11

    move-object v6, p0

    invoke-direct/range {v5 .. v10}, Lfh/f$c$a;-><init>(Lfh/f$c;Ldh/h;III)V

    invoke-interface {v3, v0, v11}, Ljava/util/List;->add(ILjava/lang/Object;)V

    move v10, v0

    :cond_5
    if-eqz v4, :cond_6

    iget-object v3, p0, Lfh/f$c;->a:Ljava/util/List;

    new-instance v11, Lfh/f$c$a;

    sget-object v6, Ldh/h;->ECI:Ldh/h;

    invoke-static {p3}, Lfh/f$b;->f(Lfh/f$b;)I

    move-result v7

    invoke-static {p3}, Lfh/f$b;->b(Lfh/f$b;)I

    move-result v8

    const/4 v9, 0x0

    move-object v4, v11

    move-object v5, p0

    invoke-direct/range {v4 .. v9}, Lfh/f$c$a;-><init>(Lfh/f$c;Ldh/h;III)V

    invoke-interface {v3, v0, v11}, Ljava/util/List;->add(ILjava/lang/Object;)V

    :cond_6
    move-object p3, v1

    move v1, v10

    goto :goto_0

    :cond_7
    invoke-static {p1}, Lfh/f;->d(Lfh/f;)Z

    move-result p3

    if-eqz p3, :cond_a

    iget-object p3, p0, Lfh/f$c;->a:Ljava/util/List;

    invoke-interface {p3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lfh/f$c$a;

    if-eqz p3, :cond_8

    invoke-static {p3}, Lfh/f$c$a;->a(Lfh/f$c$a;)Ldh/h;

    move-result-object p3

    sget-object v6, Ldh/h;->ECI:Ldh/h;

    if-eq p3, v6, :cond_8

    if-eqz v2, :cond_8

    iget-object p3, p0, Lfh/f$c;->a:Ljava/util/List;

    new-instance v1, Lfh/f$c$a;

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v4, v1

    move-object v5, p0

    invoke-direct/range {v4 .. v9}, Lfh/f$c$a;-><init>(Lfh/f$c;Ldh/h;III)V

    invoke-interface {p3, v0, v1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    :cond_8
    iget-object p3, p0, Lfh/f$c;->a:Ljava/util/List;

    invoke-interface {p3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lfh/f$c$a;

    iget-object v1, p0, Lfh/f$c;->a:Ljava/util/List;

    invoke-static {p3}, Lfh/f$c$a;->a(Lfh/f$c$a;)Ldh/h;

    move-result-object p3

    sget-object v2, Ldh/h;->ECI:Ldh/h;

    if-eq p3, v2, :cond_9

    goto :goto_2

    :cond_9
    move v0, v3

    :goto_2
    new-instance p3, Lfh/f$c$a;

    sget-object v6, Ldh/h;->FNC1_FIRST_POSITION:Ldh/h;

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v4, p3

    move-object v5, p0

    invoke-direct/range {v4 .. v9}, Lfh/f$c$a;-><init>(Lfh/f$c;Ldh/h;III)V

    invoke-interface {v1, v0, p3}, Ljava/util/List;->add(ILjava/lang/Object;)V

    :cond_a
    invoke-virtual {p2}, Ldh/j;->j()I

    move-result p3

    sget-object v0, Lfh/f$a;->a:[I

    invoke-static {p2}, Lfh/f;->m(Ldh/j;)Lfh/f$d;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    if-eq v0, v3, :cond_c

    const/4 v1, 0x2

    if-eq v0, v1, :cond_b

    const/16 v3, 0x1b

    const/16 v0, 0x28

    goto :goto_3

    :cond_b
    const/16 v3, 0xa

    const/16 v0, 0x1a

    goto :goto_3

    :cond_c
    const/16 v0, 0x9

    :goto_3
    invoke-direct {p0, p2}, Lfh/f$c;->d(Ldh/j;)I

    move-result p2

    :goto_4
    if-ge p3, v0, :cond_d

    invoke-static {p3}, Ldh/j;->i(I)Ldh/j;

    move-result-object v1

    invoke-static {p1}, Lfh/f;->a(Lfh/f;)Ldh/f;

    move-result-object v2

    invoke-static {p2, v1, v2}, Lfh/c;->v(ILdh/j;Ldh/f;)Z

    move-result v1

    if-nez v1, :cond_d

    add-int/lit8 p3, p3, 0x1

    goto :goto_4

    :cond_d
    :goto_5
    if-le p3, v3, :cond_e

    add-int/lit8 v0, p3, -0x1

    invoke-static {v0}, Ldh/j;->i(I)Ldh/j;

    move-result-object v0

    invoke-static {p1}, Lfh/f;->a(Lfh/f;)Ldh/f;

    move-result-object v1

    invoke-static {p2, v0, v1}, Lfh/c;->v(ILdh/j;Ldh/f;)Z

    move-result v0

    if-eqz v0, :cond_e

    add-int/lit8 p3, p3, -0x1

    goto :goto_5

    :cond_e
    invoke-static {p3}, Ldh/j;->i(I)Ldh/j;

    move-result-object p1

    iput-object p1, p0, Lfh/f$c;->b:Ldh/j;

    return-void
.end method

.method static synthetic a(Lfh/f$c;)Ldh/j;
    .locals 0

    iget-object p0, p0, Lfh/f$c;->b:Ldh/j;

    return-object p0
.end method

.method private d(Ldh/j;)I
    .locals 3

    iget-object v0, p0, Lfh/f$c;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lfh/f$c$a;

    invoke-static {v2, p1}, Lfh/f$c$a;->b(Lfh/f$c$a;Ldh/j;)I

    move-result v2

    add-int/2addr v1, v2

    goto :goto_0

    :cond_0
    return v1
.end method


# virtual methods
.method b(Lkg/a;)V
    .locals 2

    iget-object v0, p0, Lfh/f$c;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lfh/f$c$a;

    invoke-static {v1, p1}, Lfh/f$c$a;->c(Lfh/f$c$a;Lkg/a;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method c()I
    .locals 1

    iget-object v0, p0, Lfh/f$c;->b:Ldh/j;

    invoke-direct {p0, v0}, Lfh/f$c;->d(Ldh/j;)I

    move-result v0

    return v0
.end method

.method e()Ldh/j;
    .locals 1

    iget-object v0, p0, Lfh/f$c;->b:Ldh/j;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lfh/f$c;->a:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lfh/f$c$a;

    if-eqz v2, :cond_0

    const-string v2, ","

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    invoke-virtual {v3}, Lfh/f$c$a;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object v2, v3

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
