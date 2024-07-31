.class public final synthetic Lsc/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lee/a$a;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:J

.field public final synthetic d:Lxc/g0;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;JLxc/g0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsc/c;->a:Ljava/lang/String;

    iput-object p2, p0, Lsc/c;->b:Ljava/lang/String;

    iput-wide p3, p0, Lsc/c;->c:J

    iput-object p5, p0, Lsc/c;->d:Lxc/g0;

    return-void
.end method


# virtual methods
.method public final a(Lee/b;)V
    .locals 6

    iget-object v0, p0, Lsc/c;->a:Ljava/lang/String;

    iget-object v1, p0, Lsc/c;->b:Ljava/lang/String;

    iget-wide v2, p0, Lsc/c;->c:J

    iget-object v4, p0, Lsc/c;->d:Lxc/g0;

    move-object v5, p1

    invoke-static/range {v0 .. v5}, Lsc/d;->f(Ljava/lang/String;Ljava/lang/String;JLxc/g0;Lee/b;)V

    return-void
.end method
