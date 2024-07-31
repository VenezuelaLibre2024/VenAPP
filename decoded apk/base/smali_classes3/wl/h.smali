.class public final Lwl/h;
.super Lql/d0;
.source "SourceFile"


# instance fields
.field private final b:Ljava/lang/String;

.field private final c:J

.field private final d:Ldm/d;


# direct methods
.method public constructor <init>(Ljava/lang/String;JLdm/d;)V
    .locals 1

    const-string v0, "source"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lql/d0;-><init>()V

    iput-object p1, p0, Lwl/h;->b:Ljava/lang/String;

    iput-wide p2, p0, Lwl/h;->c:J

    iput-object p4, p0, Lwl/h;->d:Ldm/d;

    return-void
.end method


# virtual methods
.method public b()J
    .locals 2

    iget-wide v0, p0, Lwl/h;->c:J

    return-wide v0
.end method

.method public e()Lql/w;
    .locals 2

    iget-object v0, p0, Lwl/h;->b:Ljava/lang/String;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    sget-object v1, Lql/w;->e:Lql/w$a;

    invoke-virtual {v1, v0}, Lql/w$a;->b(Ljava/lang/String;)Lql/w;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public f()Ldm/d;
    .locals 1

    iget-object v0, p0, Lwl/h;->d:Ldm/d;

    return-object v0
.end method
