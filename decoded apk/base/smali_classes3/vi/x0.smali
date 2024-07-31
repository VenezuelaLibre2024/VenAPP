.class public final Lvi/x0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lvi/x0$b;,
        Lvi/x0$c;,
        Lvi/x0$d;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<ReqT:",
        "Ljava/lang/Object;",
        "RespT:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final a:Lvi/x0$d;

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private final d:Lvi/x0$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lvi/x0$c<",
            "TReqT;>;"
        }
    .end annotation
.end field

.field private final e:Lvi/x0$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lvi/x0$c<",
            "TRespT;>;"
        }
    .end annotation
.end field

.field private final f:Ljava/lang/Object;

.field private final g:Z

.field private final h:Z

.field private final i:Z

.field private final j:Ljava/util/concurrent/atomic/AtomicReferenceArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReferenceArray<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Lvi/x0$d;Ljava/lang/String;Lvi/x0$c;Lvi/x0$c;Ljava/lang/Object;ZZZ)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvi/x0$d;",
            "Ljava/lang/String;",
            "Lvi/x0$c<",
            "TReqT;>;",
            "Lvi/x0$c<",
            "TRespT;>;",
            "Ljava/lang/Object;",
            "ZZZ)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReferenceArray;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;-><init>(I)V

    iput-object v0, p0, Lvi/x0;->j:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    const-string v0, "type"

    invoke-static {p1, v0}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lvi/x0$d;

    iput-object p1, p0, Lvi/x0;->a:Lvi/x0$d;

    const-string p1, "fullMethodName"

    invoke-static {p2, p1}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lvi/x0;->b:Ljava/lang/String;

    invoke-static {p2}, Lvi/x0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lvi/x0;->c:Ljava/lang/String;

    const-string p1, "requestMarshaller"

    invoke-static {p3, p1}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lvi/x0$c;

    iput-object p1, p0, Lvi/x0;->d:Lvi/x0$c;

    const-string p1, "responseMarshaller"

    invoke-static {p4, p1}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lvi/x0$c;

    iput-object p1, p0, Lvi/x0;->e:Lvi/x0$c;

    iput-object p5, p0, Lvi/x0;->f:Ljava/lang/Object;

    iput-boolean p6, p0, Lvi/x0;->g:Z

    iput-boolean p7, p0, Lvi/x0;->h:Z

    iput-boolean p8, p0, Lvi/x0;->i:Z

    return-void
.end method

.method synthetic constructor <init>(Lvi/x0$d;Ljava/lang/String;Lvi/x0$c;Lvi/x0$c;Ljava/lang/Object;ZZZLvi/x0$a;)V
    .locals 0

    invoke-direct/range {p0 .. p8}, Lvi/x0;-><init>(Lvi/x0$d;Ljava/lang/String;Lvi/x0$c;Lvi/x0$c;Ljava/lang/Object;ZZZ)V

    return-void
.end method

.method public static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, "fullMethodName"

    invoke-static {p0, v0}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const/16 v1, 0x2f

    invoke-virtual {v0, v1}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "fullServiceName"

    invoke-static {p0, v1}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "/"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "methodName"

    invoke-static {p1, p0}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static g()Lvi/x0$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ReqT:",
            "Ljava/lang/Object;",
            "RespT:",
            "Ljava/lang/Object;",
            ">()",
            "Lvi/x0$b<",
            "TReqT;TRespT;>;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-static {v0, v0}, Lvi/x0;->h(Lvi/x0$c;Lvi/x0$c;)Lvi/x0$b;

    move-result-object v0

    return-object v0
.end method

.method public static h(Lvi/x0$c;Lvi/x0$c;)Lvi/x0$b;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ReqT:",
            "Ljava/lang/Object;",
            "RespT:",
            "Ljava/lang/Object;",
            ">(",
            "Lvi/x0$c<",
            "TReqT;>;",
            "Lvi/x0$c<",
            "TRespT;>;)",
            "Lvi/x0$b<",
            "TReqT;TRespT;>;"
        }
    .end annotation

    new-instance v0, Lvi/x0$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lvi/x0$b;-><init>(Lvi/x0$a;)V

    invoke-virtual {v0, p0}, Lvi/x0$b;->c(Lvi/x0$c;)Lvi/x0$b;

    move-result-object p0

    invoke-virtual {p0, p1}, Lvi/x0$b;->d(Lvi/x0$c;)Lvi/x0$b;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lvi/x0;->b:Ljava/lang/String;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lvi/x0;->c:Ljava/lang/String;

    return-object v0
.end method

.method public e()Lvi/x0$d;
    .locals 1

    iget-object v0, p0, Lvi/x0;->a:Lvi/x0$d;

    return-object v0
.end method

.method public f()Z
    .locals 1

    iget-boolean v0, p0, Lvi/x0;->h:Z

    return v0
.end method

.method public i(Ljava/io/InputStream;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/InputStream;",
            ")TRespT;"
        }
    .end annotation

    iget-object v0, p0, Lvi/x0;->e:Lvi/x0$c;

    invoke-interface {v0, p1}, Lvi/x0$c;->b(Ljava/io/InputStream;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public j(Ljava/lang/Object;)Ljava/io/InputStream;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TReqT;)",
            "Ljava/io/InputStream;"
        }
    .end annotation

    iget-object v0, p0, Lvi/x0;->d:Lvi/x0$c;

    invoke-interface {v0, p1}, Lvi/x0$c;->a(Ljava/lang/Object;)Ljava/io/InputStream;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Leb/i;->c(Ljava/lang/Object;)Leb/i$b;

    move-result-object v0

    const-string v1, "fullMethodName"

    iget-object v2, p0, Lvi/x0;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Leb/i$b;->d(Ljava/lang/String;Ljava/lang/Object;)Leb/i$b;

    move-result-object v0

    const-string v1, "type"

    iget-object v2, p0, Lvi/x0;->a:Lvi/x0$d;

    invoke-virtual {v0, v1, v2}, Leb/i$b;->d(Ljava/lang/String;Ljava/lang/Object;)Leb/i$b;

    move-result-object v0

    const-string v1, "idempotent"

    iget-boolean v2, p0, Lvi/x0;->g:Z

    invoke-virtual {v0, v1, v2}, Leb/i$b;->e(Ljava/lang/String;Z)Leb/i$b;

    move-result-object v0

    const-string v1, "safe"

    iget-boolean v2, p0, Lvi/x0;->h:Z

    invoke-virtual {v0, v1, v2}, Leb/i$b;->e(Ljava/lang/String;Z)Leb/i$b;

    move-result-object v0

    const-string v1, "sampledToLocalTracing"

    iget-boolean v2, p0, Lvi/x0;->i:Z

    invoke-virtual {v0, v1, v2}, Leb/i$b;->e(Ljava/lang/String;Z)Leb/i$b;

    move-result-object v0

    const-string v1, "requestMarshaller"

    iget-object v2, p0, Lvi/x0;->d:Lvi/x0$c;

    invoke-virtual {v0, v1, v2}, Leb/i$b;->d(Ljava/lang/String;Ljava/lang/Object;)Leb/i$b;

    move-result-object v0

    const-string v1, "responseMarshaller"

    iget-object v2, p0, Lvi/x0;->e:Lvi/x0$c;

    invoke-virtual {v0, v1, v2}, Leb/i$b;->d(Ljava/lang/String;Ljava/lang/Object;)Leb/i$b;

    move-result-object v0

    const-string v1, "schemaDescriptor"

    iget-object v2, p0, Lvi/x0;->f:Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Leb/i$b;->d(Ljava/lang/String;Ljava/lang/Object;)Leb/i$b;

    move-result-object v0

    invoke-virtual {v0}, Leb/i$b;->m()Leb/i$b;

    move-result-object v0

    invoke-virtual {v0}, Leb/i$b;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
