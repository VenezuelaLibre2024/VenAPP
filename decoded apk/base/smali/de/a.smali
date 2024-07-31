.class public Lde/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lde/a$b;
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lde/d;


# direct methods
.method private constructor <init>(Ljava/lang/String;Lde/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lde/a;->a:Ljava/lang/String;

    iput-object p2, p0, Lde/a;->b:Lde/d;

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;Lde/d;Lde/a$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lde/a;-><init>(Ljava/lang/String;Lde/d;)V

    return-void
.end method

.method public static a()Lde/a$b;
    .locals 1

    new-instance v0, Lde/a$b;

    invoke-direct {v0}, Lde/a$b;-><init>()V

    return-object v0
.end method


# virtual methods
.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lde/a;->a:Ljava/lang/String;

    return-object v0
.end method

.method public c()Lde/d;
    .locals 1

    iget-object v0, p0, Lde/a;->b:Lde/d;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lde/a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lde/a;

    invoke-virtual {p0}, Lde/a;->hashCode()I

    move-result v1

    invoke-virtual {p1}, Lde/a;->hashCode()I

    move-result v3

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lde/a;->a:Ljava/lang/String;

    if-nez v1, :cond_3

    iget-object v3, p1, Lde/a;->a:Ljava/lang/String;

    if-nez v3, :cond_4

    :cond_3
    if-eqz v1, :cond_5

    iget-object v3, p1, Lde/a;->a:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    :cond_4
    return v2

    :cond_5
    iget-object v1, p0, Lde/a;->b:Lde/d;

    if-nez v1, :cond_6

    iget-object v3, p1, Lde/a;->b:Lde/d;

    if-eqz v3, :cond_7

    :cond_6
    if-eqz v1, :cond_8

    iget-object p1, p1, Lde/a;->b:Lde/d;

    invoke-virtual {v1, p1}, Lde/d;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_8

    :cond_7
    return v0

    :cond_8
    return v2
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lde/a;->a:Ljava/lang/String;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    iget-object v2, p0, Lde/a;->b:Lde/d;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lde/d;->hashCode()I

    move-result v1

    :cond_1
    add-int/2addr v0, v1

    return v0
.end method
