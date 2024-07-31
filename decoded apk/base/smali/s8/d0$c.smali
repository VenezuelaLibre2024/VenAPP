.class public final Ls8/d0$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls8/d0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field public final a:Lv7/u;

.field public final b:Lv7/x;

.field public final c:Ljava/io/IOException;

.field public final d:I


# direct methods
.method public constructor <init>(Lv7/u;Lv7/x;Ljava/io/IOException;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls8/d0$c;->a:Lv7/u;

    iput-object p2, p0, Ls8/d0$c;->b:Lv7/x;

    iput-object p3, p0, Ls8/d0$c;->c:Ljava/io/IOException;

    iput p4, p0, Ls8/d0$c;->d:I

    return-void
.end method
