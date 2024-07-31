.class Lwi/h;
.super Lio/grpc/internal/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lwi/h$b;,
        Lwi/h$a;
    }
.end annotation


# static fields
.field private static final p:Ldm/b;


# instance fields
.field private final h:Lvi/x0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lvi/x0<",
            "**>;"
        }
    .end annotation
.end field

.field private final i:Ljava/lang/String;

.field private final j:Lio/grpc/internal/h2;

.field private k:Ljava/lang/String;

.field private final l:Lwi/h$b;

.field private final m:Lwi/h$a;

.field private final n:Lvi/a;

.field private o:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ldm/b;

    invoke-direct {v0}, Ldm/b;-><init>()V

    sput-object v0, Lwi/h;->p:Ldm/b;

    return-void
.end method

.method constructor <init>(Lvi/x0;Lvi/w0;Lwi/b;Lwi/i;Lwi/q;Ljava/lang/Object;IILjava/lang/String;Ljava/lang/String;Lio/grpc/internal/h2;Lio/grpc/internal/n2;Lvi/c;Z)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvi/x0<",
            "**>;",
            "Lvi/w0;",
            "Lwi/b;",
            "Lwi/i;",
            "Lwi/q;",
            "Ljava/lang/Object;",
            "II",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/grpc/internal/h2;",
            "Lio/grpc/internal/n2;",
            "Lvi/c;",
            "Z)V"
        }
    .end annotation

    move-object v10, p0

    new-instance v1, Lwi/p;

    invoke-direct {v1}, Lwi/p;-><init>()V

    const/4 v7, 0x0

    if-eqz p14, :cond_0

    invoke-virtual {p1}, Lvi/x0;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    move v6, v0

    goto :goto_0

    :cond_0
    move v6, v7

    :goto_0
    move-object v0, p0

    move-object/from16 v2, p11

    move-object/from16 v3, p12

    move-object v4, p2

    move-object/from16 v5, p13

    invoke-direct/range {v0 .. v6}, Lio/grpc/internal/a;-><init>(Lio/grpc/internal/p2;Lio/grpc/internal/h2;Lio/grpc/internal/n2;Lvi/w0;Lvi/c;Z)V

    new-instance v0, Lwi/h$a;

    invoke-direct {v0, p0}, Lwi/h$a;-><init>(Lwi/h;)V

    iput-object v0, v10, Lwi/h;->m:Lwi/h$a;

    iput-boolean v7, v10, Lwi/h;->o:Z

    const-string v0, "statsTraceCtx"

    move-object/from16 v3, p11

    invoke-static {v3, v0}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/grpc/internal/h2;

    iput-object v0, v10, Lwi/h;->j:Lio/grpc/internal/h2;

    move-object v0, p1

    iput-object v0, v10, Lwi/h;->h:Lvi/x0;

    move-object/from16 v1, p9

    iput-object v1, v10, Lwi/h;->k:Ljava/lang/String;

    move-object/from16 v1, p10

    iput-object v1, v10, Lwi/h;->i:Ljava/lang/String;

    invoke-virtual/range {p4 .. p4}, Lwi/i;->V()Lvi/a;

    move-result-object v1

    iput-object v1, v10, Lwi/h;->n:Lvi/a;

    new-instance v11, Lwi/h$b;

    invoke-virtual {p1}, Lvi/x0;->c()Ljava/lang/String;

    move-result-object v9

    move-object v0, v11

    move-object v1, p0

    move/from16 v2, p7

    move-object/from16 v4, p6

    move-object v5, p3

    move-object/from16 v6, p5

    move-object/from16 v7, p4

    move/from16 v8, p8

    invoke-direct/range {v0 .. v9}, Lwi/h$b;-><init>(Lwi/h;ILio/grpc/internal/h2;Ljava/lang/Object;Lwi/b;Lwi/q;Lwi/i;ILjava/lang/String;)V

    iput-object v11, v10, Lwi/h;->l:Lwi/h$b;

    return-void
.end method

.method static synthetic A(Lwi/h;)Lvi/x0;
    .locals 0

    iget-object p0, p0, Lwi/h;->h:Lvi/x0;

    return-object p0
.end method

.method static synthetic B(Lwi/h;)Z
    .locals 0

    iget-boolean p0, p0, Lwi/h;->o:Z

    return p0
.end method

.method static synthetic C(Lwi/h;)Lio/grpc/internal/n2;
    .locals 0

    invoke-virtual {p0}, Lio/grpc/internal/a;->w()Lio/grpc/internal/n2;

    move-result-object p0

    return-object p0
.end method

.method static synthetic D(Lwi/h;Z)Z
    .locals 0

    iput-boolean p1, p0, Lwi/h;->o:Z

    return p1
.end method

.method static synthetic E(Lwi/h;)Lio/grpc/internal/h2;
    .locals 0

    iget-object p0, p0, Lwi/h;->j:Lio/grpc/internal/h2;

    return-object p0
.end method

.method static synthetic F(Lwi/h;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lwi/h;->k:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic G(Lwi/h;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lwi/h;->i:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic H(Lwi/h;)Lwi/h$b;
    .locals 0

    iget-object p0, p0, Lwi/h;->l:Lwi/h$b;

    return-object p0
.end method

.method static synthetic I()Ldm/b;
    .locals 1

    sget-object v0, Lwi/h;->p:Ldm/b;

    return-object v0
.end method

.method static synthetic J(Lwi/h;I)V
    .locals 0

    invoke-virtual {p0, p1}, Lio/grpc/internal/d;->s(I)V

    return-void
.end method

.method static synthetic K(Lwi/h;)Lio/grpc/internal/n2;
    .locals 0

    invoke-virtual {p0}, Lio/grpc/internal/a;->w()Lio/grpc/internal/n2;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public L()Lvi/x0$d;
    .locals 1

    iget-object v0, p0, Lwi/h;->h:Lvi/x0;

    invoke-virtual {v0}, Lvi/x0;->e()Lvi/x0$d;

    move-result-object v0

    return-object v0
.end method

.method protected M()Lwi/h$b;
    .locals 1

    iget-object v0, p0, Lwi/h;->l:Lwi/h$b;

    return-object v0
.end method

.method N()Z
    .locals 1

    iget-boolean v0, p0, Lwi/h;->o:Z

    return v0
.end method

.method public getAttributes()Lvi/a;
    .locals 1

    iget-object v0, p0, Lwi/h;->n:Lvi/a;

    return-object v0
.end method

.method public l(Ljava/lang/String;)V
    .locals 1

    const-string v0, "authority"

    invoke-static {p1, v0}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lwi/h;->k:Ljava/lang/String;

    return-void
.end method

.method protected bridge synthetic t()Lio/grpc/internal/d$a;
    .locals 1

    invoke-virtual {p0}, Lwi/h;->M()Lwi/h$b;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic u()Lio/grpc/internal/a$b;
    .locals 1

    invoke-virtual {p0}, Lwi/h;->z()Lwi/h$a;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic y()Lio/grpc/internal/a$c;
    .locals 1

    invoke-virtual {p0}, Lwi/h;->M()Lwi/h$b;

    move-result-object v0

    return-object v0
.end method

.method protected z()Lwi/h$a;
    .locals 1

    iget-object v0, p0, Lwi/h;->m:Lwi/h$a;

    return-object v0
.end method
