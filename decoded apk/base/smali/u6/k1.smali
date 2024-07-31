.class public final synthetic Lu6/k1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt8/r$a;


# instance fields
.field public final synthetic a:Lu6/b$a;

.field public final synthetic b:J

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lu6/b$a;JI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu6/k1;->a:Lu6/b$a;

    iput-wide p2, p0, Lu6/k1;->b:J

    iput p4, p0, Lu6/k1;->c:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 4

    iget-object v0, p0, Lu6/k1;->a:Lu6/b$a;

    iget-wide v1, p0, Lu6/k1;->b:J

    iget v3, p0, Lu6/k1;->c:I

    check-cast p1, Lu6/b;

    invoke-static {v0, v1, v2, v3, p1}, Lu6/n1;->S(Lu6/b$a;JILu6/b;)V

    return-void
.end method
