.class public final Ldf/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldf/h;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldf/g$a;
    }
.end annotation


# static fields
.field public static final b:Ldf/g$a;


# instance fields
.field private final a:Lee/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lee/b<",
            "Lf6/g;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ldf/g$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ldf/g$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Ldf/g;->b:Ldf/g$a;

    return-void
.end method

.method public constructor <init>(Lee/b;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lee/b<",
            "Lf6/g;",
            ">;)V"
        }
    .end annotation

    const-string v0, "transportFactoryProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldf/g;->a:Lee/b;

    return-void
.end method

.method public static synthetic b(Ldf/g;Ldf/z;)[B
    .locals 0

    invoke-direct {p0, p1}, Ldf/g;->c(Ldf/z;)[B

    move-result-object p0

    return-object p0
.end method

.method private final c(Ldf/z;)[B
    .locals 2

    sget-object v0, Ldf/a0;->a:Ldf/a0;

    invoke-virtual {v0}, Ldf/a0;->c()Ljd/a;

    move-result-object v0

    invoke-interface {v0, p1}, Ljd/a;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Session Event: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "EventGDTLogger"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v0, Lxk/d;->b:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    const-string v0, "this as java.lang.String).getBytes(charset)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method


# virtual methods
.method public a(Ldf/z;)V
    .locals 5

    const-string v0, "sessionEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ldf/g;->a:Lee/b;

    invoke-interface {v0}, Lee/b;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf6/g;

    const-string v1, "json"

    invoke-static {v1}, Lf6/b;->b(Ljava/lang/String;)Lf6/b;

    move-result-object v1

    new-instance v2, Ldf/f;

    invoke-direct {v2, p0}, Ldf/f;-><init>(Ldf/g;)V

    const-string v3, "FIREBASE_APPQUALITY_SESSION"

    const-class v4, Ldf/z;

    invoke-interface {v0, v3, v4, v1, v2}, Lf6/g;->b(Ljava/lang/String;Ljava/lang/Class;Lf6/b;Lf6/e;)Lf6/f;

    move-result-object v0

    invoke-static {p1}, Lf6/c;->d(Ljava/lang/Object;)Lf6/c;

    move-result-object p1

    invoke-interface {v0, p1}, Lf6/f;->b(Lf6/c;)V

    return-void
.end method
