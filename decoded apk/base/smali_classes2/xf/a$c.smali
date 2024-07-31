.class public Lxf/a$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lxf/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private final d:Ljava/lang/String;

.field private final e:Ljava/lang/String;

.field private final f:Lxf/a$b;

.field private final g:Lxf/a$b;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lxf/a$b;Lxf/a$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxf/a$c;->a:Ljava/lang/String;

    iput-object p2, p0, Lxf/a$c;->b:Ljava/lang/String;

    iput-object p3, p0, Lxf/a$c;->c:Ljava/lang/String;

    iput-object p4, p0, Lxf/a$c;->d:Ljava/lang/String;

    iput-object p5, p0, Lxf/a$c;->e:Ljava/lang/String;

    iput-object p6, p0, Lxf/a$c;->f:Lxf/a$b;

    iput-object p7, p0, Lxf/a$c;->g:Lxf/a$b;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lxf/a$c;->b:Ljava/lang/String;

    return-object v0
.end method

.method public b()Lxf/a$b;
    .locals 1

    iget-object v0, p0, Lxf/a$c;->g:Lxf/a$b;

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lxf/a$c;->c:Ljava/lang/String;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lxf/a$c;->d:Ljava/lang/String;

    return-object v0
.end method

.method public e()Lxf/a$b;
    .locals 1

    iget-object v0, p0, Lxf/a$c;->f:Lxf/a$b;

    return-object v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lxf/a$c;->e:Ljava/lang/String;

    return-object v0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lxf/a$c;->a:Ljava/lang/String;

    return-object v0
.end method
