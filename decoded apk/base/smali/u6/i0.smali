.class public final synthetic Lu6/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt8/r$a;


# instance fields
.field public final synthetic a:Lu6/b$a;

.field public final synthetic b:Lv7/u;

.field public final synthetic c:Lv7/x;

.field public final synthetic d:Ljava/io/IOException;

.field public final synthetic e:Z


# direct methods
.method public synthetic constructor <init>(Lu6/b$a;Lv7/u;Lv7/x;Ljava/io/IOException;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu6/i0;->a:Lu6/b$a;

    iput-object p2, p0, Lu6/i0;->b:Lv7/u;

    iput-object p3, p0, Lu6/i0;->c:Lv7/x;

    iput-object p4, p0, Lu6/i0;->d:Ljava/io/IOException;

    iput-boolean p5, p0, Lu6/i0;->e:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 6

    iget-object v0, p0, Lu6/i0;->a:Lu6/b$a;

    iget-object v1, p0, Lu6/i0;->b:Lv7/u;

    iget-object v2, p0, Lu6/i0;->c:Lv7/x;

    iget-object v3, p0, Lu6/i0;->d:Ljava/io/IOException;

    iget-boolean v4, p0, Lu6/i0;->e:Z

    move-object v5, p1

    check-cast v5, Lu6/b;

    invoke-static/range {v0 .. v5}, Lu6/n1;->q0(Lu6/b$a;Lv7/u;Lv7/x;Ljava/io/IOException;ZLu6/b;)V

    return-void
.end method
