.class public final synthetic Lu8/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lu8/y$a;

.field public final synthetic b:J

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lu8/y$a;JI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu8/s;->a:Lu8/y$a;

    iput-wide p2, p0, Lu8/s;->b:J

    iput p4, p0, Lu8/s;->c:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lu8/s;->a:Lu8/y$a;

    iget-wide v1, p0, Lu8/s;->b:J

    iget v3, p0, Lu8/s;->c:I

    invoke-static {v0, v1, v2, v3}, Lu8/y$a;->j(Lu8/y$a;JI)V

    return-void
.end method
