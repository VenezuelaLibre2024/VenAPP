.class public final synthetic Li4/z0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Li4/i0$b;

.field public final synthetic b:J

.field public final synthetic c:J


# direct methods
.method public synthetic constructor <init>(Li4/i0$b;JJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li4/z0;->a:Li4/i0$b;

    iput-wide p2, p0, Li4/z0;->b:J

    iput-wide p4, p0, Li4/z0;->c:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Li4/z0;->a:Li4/i0$b;

    iget-wide v1, p0, Li4/z0;->b:J

    iget-wide v3, p0, Li4/z0;->c:J

    invoke-static {v0, v1, v2, v3, v4}, Li4/a1;->a(Li4/i0$b;JJ)V

    return-void
.end method
