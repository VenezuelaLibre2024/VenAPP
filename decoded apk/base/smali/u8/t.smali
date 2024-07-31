.class public final synthetic Lu8/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lu8/y$a;

.field public final synthetic b:Lt6/u1;

.field public final synthetic c:Lw6/i;


# direct methods
.method public synthetic constructor <init>(Lu8/y$a;Lt6/u1;Lw6/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu8/t;->a:Lu8/y$a;

    iput-object p2, p0, Lu8/t;->b:Lt6/u1;

    iput-object p3, p0, Lu8/t;->c:Lw6/i;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lu8/t;->a:Lu8/y$a;

    iget-object v1, p0, Lu8/t;->b:Lt6/u1;

    iget-object v2, p0, Lu8/t;->c:Lw6/i;

    invoke-static {v0, v1, v2}, Lu8/y$a;->i(Lu8/y$a;Lt6/u1;Lw6/i;)V

    return-void
.end method
