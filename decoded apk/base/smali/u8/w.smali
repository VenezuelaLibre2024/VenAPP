.class public final synthetic Lu8/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lu8/y$a;

.field public final synthetic b:I

.field public final synthetic c:J


# direct methods
.method public synthetic constructor <init>(Lu8/y$a;IJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu8/w;->a:Lu8/y$a;

    iput p2, p0, Lu8/w;->b:I

    iput-wide p3, p0, Lu8/w;->c:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lu8/w;->a:Lu8/y$a;

    iget v1, p0, Lu8/w;->b:I

    iget-wide v2, p0, Lu8/w;->c:J

    invoke-static {v0, v1, v2, v3}, Lu8/y$a;->f(Lu8/y$a;IJ)V

    return-void
.end method
