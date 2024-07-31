.class public Lde/f;
.super Lde/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lde/f$b;
    }
.end annotation


# instance fields
.field private final e:Lde/n;

.field private final f:Lde/n;

.field private final g:Ljava/lang/String;

.field private final h:Lde/a;

.field private final i:Lde/a;

.field private final j:Lde/g;

.field private final k:Lde/g;


# direct methods
.method private constructor <init>(Lde/e;Lde/n;Lde/n;Lde/g;Lde/g;Ljava/lang/String;Lde/a;Lde/a;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lde/e;",
            "Lde/n;",
            "Lde/n;",
            "Lde/g;",
            "Lde/g;",
            "Ljava/lang/String;",
            "Lde/a;",
            "Lde/a;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    sget-object v0, Lcom/google/firebase/inappmessaging/model/MessageType;->CARD:Lcom/google/firebase/inappmessaging/model/MessageType;

    invoke-direct {p0, p1, v0, p9}, Lde/i;-><init>(Lde/e;Lcom/google/firebase/inappmessaging/model/MessageType;Ljava/util/Map;)V

    iput-object p2, p0, Lde/f;->e:Lde/n;

    iput-object p3, p0, Lde/f;->f:Lde/n;

    iput-object p4, p0, Lde/f;->j:Lde/g;

    iput-object p5, p0, Lde/f;->k:Lde/g;

    iput-object p6, p0, Lde/f;->g:Ljava/lang/String;

    iput-object p7, p0, Lde/f;->h:Lde/a;

    iput-object p8, p0, Lde/f;->i:Lde/a;

    return-void
.end method

.method synthetic constructor <init>(Lde/e;Lde/n;Lde/n;Lde/g;Lde/g;Ljava/lang/String;Lde/a;Lde/a;Ljava/util/Map;Lde/f$a;)V
    .locals 0

    invoke-direct/range {p0 .. p9}, Lde/f;-><init>(Lde/e;Lde/n;Lde/n;Lde/g;Lde/g;Ljava/lang/String;Lde/a;Lde/a;Ljava/util/Map;)V

    return-void
.end method

.method public static d()Lde/f$b;
    .locals 1

    new-instance v0, Lde/f$b;

    invoke-direct {v0}, Lde/f$b;-><init>()V

    return-object v0
.end method


# virtual methods
.method public b()Lde/g;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lde/f;->j:Lde/g;

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lde/f;->g:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lde/f;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lde/f;

    invoke-virtual {p0}, Lde/f;->hashCode()I

    move-result v1

    invoke-virtual {p1}, Lde/f;->hashCode()I

    move-result v3

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lde/f;->f:Lde/n;

    if-nez v1, :cond_3

    iget-object v3, p1, Lde/f;->f:Lde/n;

    if-nez v3, :cond_4

    :cond_3
    if-eqz v1, :cond_5

    iget-object v3, p1, Lde/f;->f:Lde/n;

    invoke-virtual {v1, v3}, Lde/n;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    :cond_4
    return v2

    :cond_5
    iget-object v1, p0, Lde/f;->i:Lde/a;

    if-nez v1, :cond_6

    iget-object v3, p1, Lde/f;->i:Lde/a;

    if-nez v3, :cond_7

    :cond_6
    if-eqz v1, :cond_8

    iget-object v3, p1, Lde/f;->i:Lde/a;

    invoke-virtual {v1, v3}, Lde/a;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    :cond_7
    return v2

    :cond_8
    iget-object v1, p0, Lde/f;->j:Lde/g;

    if-nez v1, :cond_9

    iget-object v3, p1, Lde/f;->j:Lde/g;

    if-nez v3, :cond_a

    :cond_9
    if-eqz v1, :cond_b

    iget-object v3, p1, Lde/f;->j:Lde/g;

    invoke-virtual {v1, v3}, Lde/g;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    :cond_a
    return v2

    :cond_b
    iget-object v1, p0, Lde/f;->k:Lde/g;

    if-nez v1, :cond_c

    iget-object v3, p1, Lde/f;->k:Lde/g;

    if-nez v3, :cond_d

    :cond_c
    if-eqz v1, :cond_e

    iget-object v3, p1, Lde/f;->k:Lde/g;

    invoke-virtual {v1, v3}, Lde/g;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    :cond_d
    return v2

    :cond_e
    iget-object v1, p0, Lde/f;->e:Lde/n;

    iget-object v3, p1, Lde/f;->e:Lde/n;

    invoke-virtual {v1, v3}, Lde/n;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lde/f;->h:Lde/a;

    iget-object v3, p1, Lde/f;->h:Lde/a;

    invoke-virtual {v1, v3}, Lde/a;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lde/f;->g:Ljava/lang/String;

    iget-object p1, p1, Lde/f;->g:Ljava/lang/String;

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_11

    return v0

    :cond_11
    return v2
.end method

.method public f()Lde/n;
    .locals 1

    iget-object v0, p0, Lde/f;->f:Lde/n;

    return-object v0
.end method

.method public g()Lde/g;
    .locals 1

    iget-object v0, p0, Lde/f;->k:Lde/g;

    return-object v0
.end method

.method public h()Lde/g;
    .locals 1

    iget-object v0, p0, Lde/f;->j:Lde/g;

    return-object v0
.end method

.method public hashCode()I
    .locals 5

    iget-object v0, p0, Lde/f;->f:Lde/n;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lde/n;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    iget-object v2, p0, Lde/f;->i:Lde/a;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lde/a;->hashCode()I

    move-result v2

    goto :goto_1

    :cond_1
    move v2, v1

    :goto_1
    iget-object v3, p0, Lde/f;->j:Lde/g;

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Lde/g;->hashCode()I

    move-result v3

    goto :goto_2

    :cond_2
    move v3, v1

    :goto_2
    iget-object v4, p0, Lde/f;->k:Lde/g;

    if-eqz v4, :cond_3

    invoke-virtual {v4}, Lde/g;->hashCode()I

    move-result v1

    :cond_3
    iget-object v4, p0, Lde/f;->e:Lde/n;

    invoke-virtual {v4}, Lde/n;->hashCode()I

    move-result v4

    add-int/2addr v4, v0

    iget-object v0, p0, Lde/f;->g:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    add-int/2addr v4, v0

    iget-object v0, p0, Lde/f;->h:Lde/a;

    invoke-virtual {v0}, Lde/a;->hashCode()I

    move-result v0

    add-int/2addr v4, v0

    add-int/2addr v4, v2

    add-int/2addr v4, v3

    add-int/2addr v4, v1

    return v4
.end method

.method public i()Lde/a;
    .locals 1

    iget-object v0, p0, Lde/f;->h:Lde/a;

    return-object v0
.end method

.method public j()Lde/a;
    .locals 1

    iget-object v0, p0, Lde/f;->i:Lde/a;

    return-object v0
.end method

.method public k()Lde/n;
    .locals 1

    iget-object v0, p0, Lde/f;->e:Lde/n;

    return-object v0
.end method
