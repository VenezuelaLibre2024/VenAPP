.class public interface abstract Lm3/a$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm3/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "e"
.end annotation


# static fields
.field public static final a:Lm3/a$e;

.field public static final b:Lm3/a$e;

.field public static final c:Lm3/a$e;

.field public static final d:Lm3/a$e;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lm3/a$e$a;

    invoke-direct {v0}, Lm3/a$e$a;-><init>()V

    sput-object v0, Lm3/a$e;->a:Lm3/a$e;

    new-instance v0, Lm3/a$e$b;

    invoke-direct {v0}, Lm3/a$e$b;-><init>()V

    sput-object v0, Lm3/a$e;->b:Lm3/a$e;

    new-instance v1, Lm3/a$e$c;

    invoke-direct {v1}, Lm3/a$e$c;-><init>()V

    sput-object v1, Lm3/a$e;->c:Lm3/a$e;

    sput-object v0, Lm3/a$e;->d:Lm3/a$e;

    return-void
.end method


# virtual methods
.method public abstract a(Ljava/lang/Throwable;)V
.end method
