.class public Lxf/a$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lxf/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# instance fields
.field private final a:Lxf/a$h;

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private final d:Ljava/util/List;

.field private final e:Ljava/util/List;

.field private final f:Ljava/util/List;

.field private final g:Ljava/util/List;


# direct methods
.method public constructor <init>(Lxf/a$h;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxf/a$h;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lxf/a$i;",
            ">;",
            "Ljava/util/List<",
            "Lxf/a$f;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Lxf/a$a;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxf/a$d;->a:Lxf/a$h;

    iput-object p2, p0, Lxf/a$d;->b:Ljava/lang/String;

    iput-object p3, p0, Lxf/a$d;->c:Ljava/lang/String;

    iput-object p4, p0, Lxf/a$d;->d:Ljava/util/List;

    iput-object p5, p0, Lxf/a$d;->e:Ljava/util/List;

    iput-object p6, p0, Lxf/a$d;->f:Ljava/util/List;

    iput-object p7, p0, Lxf/a$d;->g:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lxf/a$a;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lxf/a$d;->g:Ljava/util/List;

    return-object v0
.end method

.method public b()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lxf/a$f;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lxf/a$d;->e:Ljava/util/List;

    return-object v0
.end method

.method public c()Lxf/a$h;
    .locals 1

    iget-object v0, p0, Lxf/a$d;->a:Lxf/a$h;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lxf/a$d;->b:Ljava/lang/String;

    return-object v0
.end method

.method public e()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lxf/a$i;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lxf/a$d;->d:Ljava/util/List;

    return-object v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lxf/a$d;->c:Ljava/lang/String;

    return-object v0
.end method

.method public g()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lxf/a$d;->f:Ljava/util/List;

    return-object v0
.end method
