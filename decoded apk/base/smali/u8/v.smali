.class public final synthetic Lu8/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lu8/y$a;

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:J


# direct methods
.method public synthetic constructor <init>(Lu8/y$a;Ljava/lang/Object;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu8/v;->a:Lu8/y$a;

    iput-object p2, p0, Lu8/v;->b:Ljava/lang/Object;

    iput-wide p3, p0, Lu8/v;->c:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lu8/v;->a:Lu8/y$a;

    iget-object v1, p0, Lu8/v;->b:Ljava/lang/Object;

    iget-wide v2, p0, Lu8/v;->c:J

    invoke-static {v0, v1, v2, v3}, Lu8/y$a;->e(Lu8/y$a;Ljava/lang/Object;J)V

    return-void
.end method
