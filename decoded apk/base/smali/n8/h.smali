.class final Ln8/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg8/i;


# instance fields
.field private final a:Ln8/d;

.field private final b:[J

.field private final c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ln8/g;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ln8/e;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ln8/d;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln8/d;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ln8/g;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ln8/e;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln8/h;->a:Ln8/d;

    iput-object p3, p0, Ln8/h;->d:Ljava/util/Map;

    iput-object p4, p0, Ln8/h;->e:Ljava/util/Map;

    if-eqz p2, :cond_0

    invoke-static {p2}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p2

    goto :goto_0

    :cond_0
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object p2

    :goto_0
    iput-object p2, p0, Ln8/h;->c:Ljava/util/Map;

    invoke-virtual {p1}, Ln8/d;->j()[J

    move-result-object p1

    iput-object p1, p0, Ln8/h;->b:[J

    return-void
.end method


# virtual methods
.method public b(J)I
    .locals 2

    iget-object v0, p0, Ln8/h;->b:[J

    const/4 v1, 0x0

    invoke-static {v0, p1, p2, v1, v1}, Lt8/r0;->e([JJZZ)I

    move-result p1

    iget-object p2, p0, Ln8/h;->b:[J

    array-length p2, p2

    if-ge p1, p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, -0x1

    :goto_0
    return p1
.end method

.method public h(J)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Ljava/util/List<",
            "Lg8/b;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ln8/h;->a:Ln8/d;

    iget-object v3, p0, Ln8/h;->c:Ljava/util/Map;

    iget-object v4, p0, Ln8/h;->d:Ljava/util/Map;

    iget-object v5, p0, Ln8/h;->e:Ljava/util/Map;

    move-wide v1, p1

    invoke-virtual/range {v0 .. v5}, Ln8/d;->h(JLjava/util/Map;Ljava/util/Map;Ljava/util/Map;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public i(I)J
    .locals 3

    iget-object v0, p0, Ln8/h;->b:[J

    aget-wide v1, v0, p1

    return-wide v1
.end method

.method public l()I
    .locals 1

    iget-object v0, p0, Ln8/h;->b:[J

    array-length v0, v0

    return v0
.end method
