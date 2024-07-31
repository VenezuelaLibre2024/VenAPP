.class public final synthetic Lv7/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lv7/h0$a;

.field public final synthetic b:Lv7/h0;

.field public final synthetic c:Lv7/u;

.field public final synthetic d:Lv7/x;

.field public final synthetic e:Ljava/io/IOException;

.field public final synthetic f:Z


# direct methods
.method public synthetic constructor <init>(Lv7/h0$a;Lv7/h0;Lv7/u;Lv7/x;Ljava/io/IOException;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv7/d0;->a:Lv7/h0$a;

    iput-object p2, p0, Lv7/d0;->b:Lv7/h0;

    iput-object p3, p0, Lv7/d0;->c:Lv7/u;

    iput-object p4, p0, Lv7/d0;->d:Lv7/x;

    iput-object p5, p0, Lv7/d0;->e:Ljava/io/IOException;

    iput-boolean p6, p0, Lv7/d0;->f:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, Lv7/d0;->a:Lv7/h0$a;

    iget-object v1, p0, Lv7/d0;->b:Lv7/h0;

    iget-object v2, p0, Lv7/d0;->c:Lv7/u;

    iget-object v3, p0, Lv7/d0;->d:Lv7/x;

    iget-object v4, p0, Lv7/d0;->e:Ljava/io/IOException;

    iget-boolean v5, p0, Lv7/d0;->f:Z

    invoke-static/range {v0 .. v5}, Lv7/h0$a;->b(Lv7/h0$a;Lv7/h0;Lv7/u;Lv7/x;Ljava/io/IOException;Z)V

    return-void
.end method
