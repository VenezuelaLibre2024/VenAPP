.class public final synthetic Lu6/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt8/r$a;


# instance fields
.field public final synthetic a:Lu6/b$a;

.field public final synthetic b:J


# direct methods
.method public synthetic constructor <init>(Lu6/b$a;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu6/o;->a:Lu6/b$a;

    iput-wide p2, p0, Lu6/o;->b:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lu6/o;->a:Lu6/b$a;

    iget-wide v1, p0, Lu6/o;->b:J

    check-cast p1, Lu6/b;

    invoke-static {v0, v1, v2, p1}, Lu6/n1;->N0(Lu6/b$a;JLu6/b;)V

    return-void
.end method
