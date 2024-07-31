.class public final Ltb/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltb/c$b;,
        Ltb/c$c;
    }
.end annotation


# instance fields
.field private final a:Ltb/a;

.field private final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ltb/c$c;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Ljava/lang/Integer;


# direct methods
.method private constructor <init>(Ltb/a;Ljava/util/List;Ljava/lang/Integer;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltb/a;",
            "Ljava/util/List<",
            "Ltb/c$c;",
            ">;",
            "Ljava/lang/Integer;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltb/c;->a:Ltb/a;

    iput-object p2, p0, Ltb/c;->b:Ljava/util/List;

    iput-object p3, p0, Ltb/c;->c:Ljava/lang/Integer;

    return-void
.end method

.method synthetic constructor <init>(Ltb/a;Ljava/util/List;Ljava/lang/Integer;Ltb/c$a;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Ltb/c;-><init>(Ltb/a;Ljava/util/List;Ljava/lang/Integer;)V

    return-void
.end method

.method public static a()Ltb/c$b;
    .locals 1

    new-instance v0, Ltb/c$b;

    invoke-direct {v0}, Ltb/c$b;-><init>()V

    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Ltb/c;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Ltb/c;

    iget-object v0, p0, Ltb/c;->a:Ltb/a;

    iget-object v2, p1, Ltb/c;->a:Ltb/a;

    invoke-virtual {v0, v2}, Ltb/a;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ltb/c;->b:Ljava/util/List;

    iget-object v2, p1, Ltb/c;->b:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ltb/c;->c:Ljava/lang/Integer;

    iget-object p1, p1, Ltb/c;->c:Ljava/lang/Integer;

    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Ltb/c;->a:Ltb/a;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, Ltb/c;->b:Ljava/util/List;

    aput-object v2, v0, v1

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Ltb/c;->a:Ltb/a;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, Ltb/c;->b:Ljava/util/List;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    iget-object v2, p0, Ltb/c;->c:Ljava/lang/Integer;

    aput-object v2, v0, v1

    const-string v1, "(annotations=%s, entries=%s, primaryKeyId=%s)"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
