.class public Lde/h;
.super Lde/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lde/h$b;
    }
.end annotation


# instance fields
.field private e:Lde/g;

.field private f:Lde/a;


# direct methods
.method private constructor <init>(Lde/e;Lde/g;Lde/a;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lde/e;",
            "Lde/g;",
            "Lde/a;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    sget-object v0, Lcom/google/firebase/inappmessaging/model/MessageType;->IMAGE_ONLY:Lcom/google/firebase/inappmessaging/model/MessageType;

    invoke-direct {p0, p1, v0, p4}, Lde/i;-><init>(Lde/e;Lcom/google/firebase/inappmessaging/model/MessageType;Ljava/util/Map;)V

    iput-object p2, p0, Lde/h;->e:Lde/g;

    iput-object p3, p0, Lde/h;->f:Lde/a;

    return-void
.end method

.method synthetic constructor <init>(Lde/e;Lde/g;Lde/a;Ljava/util/Map;Lde/h$a;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lde/h;-><init>(Lde/e;Lde/g;Lde/a;Ljava/util/Map;)V

    return-void
.end method

.method public static d()Lde/h$b;
    .locals 1

    new-instance v0, Lde/h$b;

    invoke-direct {v0}, Lde/h$b;-><init>()V

    return-object v0
.end method


# virtual methods
.method public b()Lde/g;
    .locals 1

    iget-object v0, p0, Lde/h;->e:Lde/g;

    return-object v0
.end method

.method public e()Lde/a;
    .locals 1

    iget-object v0, p0, Lde/h;->f:Lde/a;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lde/h;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lde/h;

    invoke-virtual {p0}, Lde/h;->hashCode()I

    move-result v1

    invoke-virtual {p1}, Lde/h;->hashCode()I

    move-result v3

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lde/h;->f:Lde/a;

    if-nez v1, :cond_3

    iget-object v3, p1, Lde/h;->f:Lde/a;

    if-nez v3, :cond_4

    :cond_3
    if-eqz v1, :cond_5

    iget-object v3, p1, Lde/h;->f:Lde/a;

    invoke-virtual {v1, v3}, Lde/a;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    :cond_4
    return v2

    :cond_5
    iget-object v1, p0, Lde/h;->e:Lde/g;

    iget-object p1, p1, Lde/h;->e:Lde/g;

    invoke-virtual {v1, p1}, Lde/g;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6

    return v0

    :cond_6
    return v2
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lde/h;->f:Lde/a;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lde/a;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lde/h;->e:Lde/g;

    invoke-virtual {v1}, Lde/g;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method
